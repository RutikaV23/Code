import java.util.*;
public class ArmStrong2{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int cube,a,i;
      int sum = 0;
      System.out.print("Enter the upper limit: ");
      int n = sc.nextInt();
      
      System.out.println("Armstrong numbers between 1 and " + n + " are:");

     for(i=0;i<n;i++){
      int num = i;
      int res = 0;
      while(num>0){
       a = num % 10 ;
    
       cube = a * a * a;
        res = res + cube;
        num = num/10;

      }
     
       if(res == i){
       System.out.println("The number is " + i  );
       
       sum = sum + i;
       //System.out.println("The sum of ArmStrong Number is : "+ sum );
     }
     }  
     System.out.println("The sum of ArmStrong Number is : "+ sum );

 }
}