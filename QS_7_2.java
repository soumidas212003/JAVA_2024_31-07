//Write a program to calculate CGPA using marks of three subjects(Out of 100)
import java.util.*;
public class QS_7_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2=sc.nextInt(); 
        System.out.print("Enter third number : ");
        int num3=sc.nextInt(); 
        int sum=(num1+num2+num3);
        float cgpa=(float)sum/30;
        System.out.print("CGPA is: "+cgpa);
        sc.close();
    }
}
