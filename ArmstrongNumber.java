import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int res = 0,cube,a;
      int n = sc.nextInt();
      int c = n;
      while(n>0){
       a = n % 10 ;
    
       cube = a * a * a;
        res = res + cube;
        n = n/10;

      }

       if(res == c){
       System.out.println("The number " + " is ArmStrong Number" );
    }
    else{
       System.out.println("The number " + " is not ArmStrong Number" );

    }
 }
}