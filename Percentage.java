//find the percentage of the marks
import java.util.*;

public class Percentage{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i=0;i<5;i++){
        int marks = sc.nextInt();
        total = total + marks ;
        }
        double percentage = total /100 ;
        System.out.println("Marks is : " + total + " and percentage is : " + percentage);
    }
}