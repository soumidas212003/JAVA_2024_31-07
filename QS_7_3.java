//Write a java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.
import java.util.*;
public class QS_7_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name= sc.next();
        System.out.print("Hello "+name+", have a good day! ");
        sc.close();
    }
}
