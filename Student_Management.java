package JAVACODES;

import java.util.ArrayList;
import java.util.Scanner;
public class Student_Management {
    
    //add student
    static public class Add_student {
        
        ArrayList<Integer> idlist=new ArrayList<>();
        ArrayList<String> name=new ArrayList<>();
        ArrayList<String> standard=new ArrayList<>();
        ArrayList<Integer> marks=new ArrayList<>();

        public Add_student(int id,String n,String st , int m) {
            idlist.add(id);
            name.add(n);
            standard.add(st);
            marks.add(m);
        }
        public void display(){
            System.out.println("STUDENT DETAIL");
        }
        public void update_mark(){
            
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
                int id;
                String n;
                String standard;
                int m;
                for (int i = 0; i <= 1; i++) {
                System.out.println("enter id: ");
                id=s.nextInt();
                System.out.println("enter name: ");
                n=s.nextLine();
                System.out.println("enter class: ");
                standard=s.nextLine();
                System.out.println("enter marks: ");
                m=s.nextInt();
                Add_student st = new Add_student(id,n,standard,m);
                }                
                break;
            case 2:
                display();
                break;
            case 3:
                update_mark();
                break;
            case 4:
                System.out.println("THANK YOU");
                return;
            default:
                throw new AssertionError();
        }
    }
}