//Write a program to sum three numbers in java
import java.util.*;
public class QS_7_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2=sc.nextInt(); 
        System.out.print("Enter third number : ");
        int num3=sc.nextInt(); 
        int sum=(num1+num2+num3);
        System.out.print("Sum of three numbers is: "+sum);
        sc.close();
    }
}