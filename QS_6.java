//Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard(Marks are out of 100)
import java.util.*;
public class QS_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c=0;
        for(int a=1;a<=5;a++){
            System.out.print(" Enter Your number:");
            int count=sc.nextInt();
            if(count<=100){
                c+=count;
            }else{
                System.out.println("Please provide marks out of 100");
                a=a-1;//2
            }
        }
        float per=(float)c/5;
        System.out.println("Percentage is: "+per);
        sc.close();
    }
}