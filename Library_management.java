package JAVACODES;

//return
//show available book
//add
//issue
import java.util.ArrayList;
import java.util.Scanner;

public class  Library_management{
    ArrayList<String>bookname=new ArrayList<>();
    ArrayList<Integer>bookid=new ArrayList<>();
    ArrayList<Integer>quantity=new ArrayList<>();

    public void Add_book(String b_name,int b_id,int quantity){
        this.bookname.add(b_name);
        this.bookid.add(b_id);
        this.quantity.add(quantity);
        System.out.println("Added book");
    }
    public static void Display(Library_management l){
        Scanner s = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("LIBRARY MANAGEMENT");
        System.out.println("1. Add book");
        System.out.println("2. Issue book");
        System.out.println("3. Check available book");
        System.out.println("4. return book");
        System.out.println("5. Exit");
        System.out.println("======================================================");
    
        System.out.print("enter choice: ");
        int choice=s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter book id: ");
            int b_id = s.nextInt();
            System.out.println("Enter book name: ");
            String b_name=s.nextLine();
            s.nextLine();
            System.out.println("Enter quantity of books: ");
            int quantity=s.nextInt();
            l.Add_book(b_name, b_id, quantity);
            
            break;
            case 2:
                
            break;
            case 3:
                
                break;
                case 4:
            
            break;
            case 5:
                
                break;
                default:
                    throw new AssertionError();
                }
            Display(l);
            }
            public static void main(String[] args) {
                Library_management l = new Library_management();
                Display(l);
            }
        }