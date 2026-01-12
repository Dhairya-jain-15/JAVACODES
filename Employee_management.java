package JAVACODES;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_management {

    ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(int id, String name, int sal) {
        empList.add(new Employee(id, name, sal));
    }

    public int find_id(int id) {
        for (int idx = 0; idx < empList.size(); idx++) {
            if (empList.get(idx).emp_id == id) {
                return idx;
            }
        }
        return -1;
    }

    public void update_sal(int id,int temp) {
        int idx = find_id(id);
        if(idx!=-1){
            empList.get(idx).emp_sal = temp;
        }
        else{
            System.out.println("id not found");
        }
    }

    public void displayEmployees() {
        for (Employee e : empList) {
            System.out.println(e.emp_id + " " + e.emp_name + " " + e.emp_sal);
        }
    }

    public static void Display(Employee_management em) {
        Scanner sc = new Scanner(System.in);
        while (true) {
         System.out.println("EMPLOYEE MANAGEMENT:");
        System.out.println("1. ADD EMPLOYEE");
        System.out.println("2. DISPLAY ALL EMPLOYEE");
        System.out.println("3. UPDATE SALARY OF EMPLOYEE");
        System.out.println("4. EXIT ");
        System.out.print("enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int emp_id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String emp_name = sc.nextLine();
                System.out.print("Enter Salary: ");
                int emp_sal = sc.nextInt();
                em.addEmployee(emp_id, emp_name, emp_sal);
                break;
            case 2:
                em.displayEmployees();
                break;
            case 3:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter the updated salary: ");
                int temp = sc.nextInt();
                em.update_sal(id,temp);
                break;
            case 4:
                return;
            default:
                System.out.println("invalid input");
            }
        }
    }

    public static void main(String[] args) {
        Employee_management em = new Employee_management();
        Display(em);
    }
}

class Employee {

    int emp_id;
    String emp_name;
    int emp_sal;

    public Employee(int emp_id, String emp_name, int emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

}
