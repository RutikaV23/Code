
import java.util.*;


public class PerfectSquare2{
    public static void main(String[] args) {
        double square,sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Enter Range : ");
        int n = sc.nextInt();

        System.out.println("Perfect Square numbers between 1 and " + n + " are:");
        for(int i=1;i<=n;i++){
        int num = i;
        
        square = Math.sqrt(i);
        sum = square * square;
    
        if(sum == num){
            System.out.print( i + " ");
        }
    }
  }
}