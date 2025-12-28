package JAVACODES;
import java.lang.Math;
import java.util.Scanner;
// Check prime number
// Palindrome number
// Armstrong number
// Factorial & Fibonacci

public class Number_Utility {

    static void isprime(int num) {
        if (num == 1) {
            System.out.println("neither prime not composite");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("not Prime because it is disvible by " + i);
                return;
            }
        }
        System.out.println("prime");
    }

    static void ispalindrome(int pal) {
        int og = pal;
        int ans = 0;
        for (int i = 0; pal > 0; i++) {
            int temp = pal % 10;
            ans = temp + ans * 10;
            pal = pal / 10;
        }
        if (ans == og) {
            System.out.println("palindrome");
            return;
        } else {
            System.out.println("Not palindrome");
        }
    }

    static void armstrong(int num) {
        int count = 0, total = 0, c = num;
        while (c > 0) {
            c = c / 10;
            count++;
        }
        c = num;
        while (c > 0) {
            int digit = c % 10;
            total = total + (int) Math.pow(digit, count);
            c = c / 10;
        }
        if (total == num) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("which operation you want to do:");
        System.out.println("1. check prime");
        System.out.println("2. palindrome");
        System.out.println("3. armstrong");
        System.out.println("4. factorial");
        System.out.println("5. fabonacci");
        System.out.print("Enter your choice: ");
        int option = s.nextInt();
        switch (option) {
            case 1:
                System.out.print("enter the number: ");
                int prime = s.nextInt();
                isprime(prime);
                break;
            case 2:
                System.out.print("enter the number: ");
                int palindrome = s.nextInt();
                ispalindrome(palindrome);
                break;
            case 3:
                System.out.print("enter the number: ");
                int num = s.nextInt();
                armstrong(num);
                break;
            case 4:
                System.out.print("enter number: ");
                int fact = s.nextInt();
                int res = factorial(fact);
                System.out.println(res);
                break;
            case 5:
                System.out.print("enter number: ");
                num = s.nextInt();
                fibonacci(num);
                break;
            default:
                throw new AssertionError();
        }
    }
}
