package JAVACODES;

import java.util.Scanner;

public class ATM_Simulation {

    static int deposit(int d_amt, int currbal) {
        d_amt = d_amt + currbal;
        return d_amt;
    }

    static void withdraw() {
    }

    static void checkbalance() {
    }

    static void exit() {
        return;
    }

    static void display() {
        Scanner s = new Scanner(System.in);
        int currbal = 0;
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
                d_amt = s.nextInt();
                currbal = deposit(d_amt, currbal);
                System.out.println(currbal);
                main(null);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                exit();
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        display();
    }
}
