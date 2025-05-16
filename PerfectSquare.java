
import java.util.*;


public class PerfectSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Number : ");
        int n = sc.nextInt();
        double square = Math.sqrt(n);

        double sum = square * square;

        if(sum == n){
            System.out.println( n + " is the Perfect Square Number");
        }else{
            System.out.println( n + " is  not the Perfect Square Number");

        }
    }
}