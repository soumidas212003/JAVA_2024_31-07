//Write a java program to convert kilometers to miles
import java.util.*;
public class QS_7_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers : ");
        double kilo= sc.nextDouble();
        double onemiles=0.621371;
        double miles= kilo * onemiles;
        System.out.print(kilo+" Kilometers = "+miles+" miles");
        sc.close();
    }
}
