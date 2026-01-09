package JAVACODES;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_management {

    ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(int id, String name, int sal) {
        empList.add(new Employee(id, name, sal));
    }
    public int find_id(int id){
        for (int idx = 0; idx < empList.size(); idx++) {
            if(empList.get(idx).emp_id == id) {
                return idx;
            }
        }
        return -1;
    }
    public void update_sal(){

    }
    public void displayEmployees() {
        for (Employee e : empList) {
            System.out.println(e.emp_id + " " + e.emp_name + " " + e.emp_sal);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_management em = new Employee_management();

        System.out.print("Enter ID: ");
        int emp_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String emp_name = sc.nextLine();

        System.out.print("Enter Salary: ");
        int emp_sal = sc.nextInt();

        em.addEmployee(emp_id, emp_name, emp_sal);
        em.displayEmployees();
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
