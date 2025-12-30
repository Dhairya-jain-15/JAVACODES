package JAVACODES;
import java.util.Scanner;

public class ATM_Simulation {

    static int deposit(int d_amt, int currbal) {
        d_amt = d_amt + currbal;
        return d_amt;
    }
    static int checkbalance(int currbal) {
        return currbal;
    }
    static int withdraw(int w_amt,int currbal) {
        if(w_amt>currbal){
            System.out.println("NO MONEY");
            return currbal;
        }
        else{
            currbal=currbal-w_amt;
            System.out.println("Withdrawl Completed");
            return currbal;
        }
    }
    static void exit() {
        System.out.println("THANK YOU!");
        System.out.println("======================================================");
        return;
    }

    static void display(int currbal) {
        Scanner s = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("ATM SIMULATION");
        System.out.println("1. Deposit");
        System.out.println("2. Check Balance");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter choice: ");
        int Choice = s.nextInt();
        System.out.println("======================================================");
        switch (Choice) {
            case 1:
                int d_amt = 0;
                System.out.print("Enter amount want to deposit: ");
                d_amt = s.nextInt();
                currbal = deposit(d_amt, currbal);
                System.out.println("Deposited");
                display(currbal);
                break;
            case 2:
                int res=checkbalance(currbal);
                System.out.println("The Current balance is: " + res);
                display(currbal);
                break;
            case 3:
                int w_amt = 0;
                System.out.print("Enter amount want to withdraw: ");
                w_amt = s.nextInt();
                currbal=withdraw(w_amt,currbal);
                display(currbal);
                break;
            case 4:
                exit();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int currbal = 0;
        display(currbal);
    }
}
