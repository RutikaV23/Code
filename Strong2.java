//Strong number
//145 = 1!+4!+5! = 145
import java.util.*;

public class Strong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i,sum = 0;
      System.out.print("Enter the upper limit: ");
      int n = sc.nextInt();
      System.out.println("Strong numbers between 1 and " + n + " are:");
      for(i=1;i<=n;i++){
      int num = i;
      int res = 0 ;
      
      while(num>0){
        a = num % 10 ;
        int fact = 1;
        
        for(int j=1;j<=a;j++){
        fact = fact * j;
        }

        res = res + fact;
        num = num/10;
    
      }
      //System.out.println(res);
       
       if(res == i){
       System.out.println("The number " + i );
       sum = sum + i;
       }
      }
      
      System.out.println("The sum of ArmStrong Number is : "+ sum );

 }
}