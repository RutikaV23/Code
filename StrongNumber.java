//Strong number
import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0 ;
        int fact = 1;
        int a;

      int n = sc.nextInt();
      int c = n;
      while(n>0){
        a = n % 10 ;

        for(int i=0;i<a;i++){
        fact = fact * (a - i);
        }

        res = res + fact;
        fact = 1;
        n = n/10;
    

      }
      //System.out.println(res);
       if(res == c){
       System.out.println("The number " + " is Strong Number" );
    }
    else{
       System.out.println("The number " + " is not Strong Number" );

    }
 }
}