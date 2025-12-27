package JAVACODES;
// Check prime number
// Palindrome number

import java.util.Scanner;

// Armstrong number
// Factorial & Fibonacci
public class Number_Utility {
        static void isprime(int num){
            if(num==1){
                System.out.println("neither prime not composite");
            }
            for(int i=2;i<num;i++){
                if (num%i==0) {
                    System.out.println("not Prime because it is disvible by " + i );
                    return;
                }
            }
                System.out.println("prime");
        }
        static void ispalindrome(int pal){
            int og=pal;
            int ans=0;
            for (int i=0;pal>0;i++) {
                int temp=pal%10;
                ans=temp+ans*10;
                pal=pal/10;  
            }
            if(ans==og){
                System.out.println("palindrome");
                return;
            }
            else{
                System.out.println("Not palindrome");
            }
        }
        static void armstrong(){
            
        }
        static void factorial(){
            
        }
        static void fabonacci(){
            
        }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("which operation you want to do:");
        System.out.println("1. check prime");
        System.out.println("2. palindrome");
        System.out.println("3. armstrong");
        System.out.println("4. factorial");
        System.out.println("5. fabonacci");
        System.out.print("Enter your choice: ");
        int option=s.nextInt();
        switch (option) {
            case 1:
                System.out.print("enter the number: ");
                int prime=s.nextInt();
                isprime(prime);
                break;
            case 2:
                System.out.print("enter the number: ");
                int palindrome=s.nextInt();
                ispalindrome(palindrome);
                break;
            case 3:
                armstrong();
                break;
            case 4:
                factorial();
                break;
            case 5:
                fabonacci();
                break;
            default:
                throw new AssertionError();
        }
    }
}
