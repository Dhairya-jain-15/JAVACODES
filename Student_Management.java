package JAVACODES;
import java.util.Scanner;
public class Student_Management {

    //add student
    static public class Add_student {

        public Add_student(String name, String standard, int id, int marks) {
            id++;
            System.out.println(id);
            System.out.println(name);
            System.out.println(standard);
            System.out.println(marks);
        }
    }
    //display detail
    //update marks

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student Detail");
        System.out.println("3. Update Marks");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int Choice = s.nextInt();
        System.out.println("======================================================");
        switch (Choice) {
            case 1:
                int n;
                n=s.nextInt();
                Add_student[] students = new Add_student[n];
                String name;
                name = s.next();
                String standard;
                standard = s.next();
                int marks;
                marks = s.nextInt();
                for (int i = 0; i < n; i++) {
                    students[i] = new Add_student(name,standard, i + 1, marks);
                }
                main(args);
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                System.out.println("THANK YOU");
                return;
            default:
                throw new AssertionError();
        }
    }
}
