package JAVACODES;

//return
//show available book
//add
//issue
import java.util.ArrayList;
import java.util.Scanner;

public class Library_management {

    ArrayList<String> bookname = new ArrayList<>();
    ArrayList<Integer> bookid = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();

    public int findBookIndex(int id) {
        for (int i = 0; i < bookid.size(); i++) {
            if (bookid.get(i) == id) {
                return i;
            }
        }
        return -1;
    }

    public void Add_book(String b_name, int b_id, int quantity) {
        for (int idx = 0; idx < bookid.size(); idx++) {
            if (b_id == bookid.get(idx)) {
                System.out.println("book id already exist");
                return;
            }
        }
        this.bookname.add(b_name);
        this.bookid.add(b_id);
        this.quantity.add(quantity);
        System.out.println("Added book");
    }

    public void Check_avail(int avail) {
        int index = findBookIndex(avail);
        if (index == -1) {
            System.out.println("Book not found");
            return;
        }
        if (quantity.get(index) > 0) {
            System.out.println("book available! you can issue");
        } else {
            System.out.println("book is not available");
        }
    }

    public void Issue_book(int i) {
        int index = findBookIndex(i);
        if (index == -1) {
            System.out.println("Book not found");
            return;
        }
        if (quantity.get(index) > 0) {
            int temp = quantity.get(index);
            temp--;
            quantity.set(index, temp);
            System.out.println("Book issued");
        } else {
            System.out.println("please check availability");
        }
    }

    public void book_ret(int ret) {
        int index = findBookIndex(ret);
        if (index == -1) {
            System.out.println("Book not found");
            return;
        }
        int temp = quantity.get(index);
        temp++;
        quantity.set(index, temp);
        System.out.println("Book returned!");
    }

    public void Check_status() {
        for (int idx = 0; idx < bookid.size(); idx++) {
            System.out.println(this.bookid.get(idx));
            System.out.println(this.bookname.get(idx));
            System.out.println(this.quantity.get(idx));
        }
    }

    public static void Display(Library_management l) {
        while (true) { 
        Scanner s = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("LIBRARY MANAGEMENT");
        System.out.println("1. Add book");
        System.out.println("2. Issue book");
        System.out.println("3. Check available book");
        System.out.println("4. Return book");
        System.out.println("5. Show all books");
        System.out.println("6. Exit");
        System.out.println("======================================================");

        System.out.print("Enter choice: ");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter book id: ");
                int b_id = s.nextInt();
                s.nextLine();
                System.out.println("Enter book name: ");
                String b_name = s.nextLine();
                System.out.println("Enter quantity of books: ");
                int quantity = s.nextInt();
                l.Add_book(b_name, b_id, quantity);
                break;
            case 2:
                System.out.print("Enter book id you want to issue: ");
                int issue = s.nextInt();
                l.Issue_book(issue);
                break;
            case 3:
                System.out.print("Enter id of book: ");
                int avail = s.nextInt();
                l.Check_avail(avail);
                break;
            case 4:
                System.out.println("Enter id of book you want to return: ");
                int ret = s.nextInt();
                l.book_ret(ret);
                break;
            case 5:
                l.Check_status();
                break;
            case 6:
                System.out.println("THANK YOU");
                return;
            default:
                System.out.println("Invalid choice");
        }
        }
    }

    public static void main(String[] args) {
        Library_management l = new Library_management();
        Display(l);
        System.out.println("======================================================");
        
    }
}
