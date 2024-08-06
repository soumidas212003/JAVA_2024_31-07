//Write a java program to detect whether a number entered by the user is integer or not.
import java.util.Scanner;
public class QS_7_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        if(sc.hasNextInt()){
            System.out.println("It is a interger number");
        }else{
            System.out.println("It is a not interger number");
        }    
        sc.close();
    }
}
