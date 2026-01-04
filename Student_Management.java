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
        
        public void addstudent(int id,String n,String st , int m) {
            idlist.add(id);
            name.add(n);
            standard.add(st);
            marks.add(m);
        }
        private void detail(){
            System.out.println("STUDENT DETAIL");
            for (int i = 0; i <idlist.size(); i++) {
                System.out.println(this.idlist.get(i));
                System.out.println(this.name.get(i));
                System.out.println(this.standard.get(i));
                System.out.println(this.marks.get(i));
                System.out.println("======================================================");
            }
        }
        public void update_mark(int up,int var){
                
                System.out.println(this.marks.set(up,var));
                System.out.println("======================================================");
        }
        
    }
    public static void main(String[] args) {
        Add_student st = new Add_student();
        Display(st);
    }
    private static void Display(Add_student st){
        Scanner s = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student Detail");
        System.out.println("3. Update Marks");
        System.out.println("4. Exit");
        System.out.println("======================================================");
        System.out.print("Enter choice: ");
        int Choice = s.nextInt();
        System.out.println("======================================================");
        switch(Choice) {
            case 1:
                int id;
                String n;
                String standard;
                int m;
                System.out.println("enter id: ");
                id=s.nextInt();
                s.nextLine();
                System.out.println("enter name: ");
                n=s.nextLine();
                System.out.println("enter class: ");
                standard=s.nextLine();
                System.out.println("enter marks: ");
                m=s.nextInt();
                st.addstudent(id,n,standard,m);
                break;
                case 2:
                    st.detail();
                    break;
                    case 3:
                        System.out.print("enter the id number you want changes in: ");
                        int up=s.nextInt();
                        System.out.print("write updated marks: ");
                        int var=s.nextInt();
                        st.update_mark(up-1,var);
                        break;
                        case 4:
                            System.out.println("THANK YOU");
                            s.close();
                            return;
                            default:
                                throw new AssertionError();
                            }
                            Display(st);
                        }
                    }
                    