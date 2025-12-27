package JAVACODES;
import java.util.Scanner;
// Project 1: Student Result Calculator
// Input marks of subjects
// Calculate total, percentage
// Assign grade (A/B/C/Fail)
public class student_result {
    
    static float Calculate(float a,float b,float c,float d,float e){
        float total=a+b+c+d+e;
        final float subjects=5;
        System.out.println("Total Marks is:"+total);
        float percent=((total)/subjects);
        return percent;
    }
    static void grade(float Result){
        if(Result>=80.0) {
            System.out.println("A");
        } 
        else if(Result>=70.0 && Result<80.0) {
            System.out.println("B");
        }  
        else if(Result>=60.0 && Result<70.0) {
            System.out.println("C");
        }  
        else{
            System.out.println("Fail");
        }  
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter student marks:");
        System.out.print("english:");
        float e=s.nextFloat();
        System.out.print("hindi:");
        float h=s.nextFloat();
        System.out.print("evs:");
        float evs=s.nextFloat();
        System.out.print("gk:");
        float gk=s.nextFloat();
        System.out.print("maths:");
        float m=s.nextFloat();
        float Result=Calculate(e,h,evs,gk,m);
        System.out.println(Result + "%");
        System.out.print("Grade: ");
        grade(Result);
        s.close();
    }
}