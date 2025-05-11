// largest number between the two numbers
import java.util.*;
class Main {
    
        public static void largestNumber(int n,int m){
            
              if (n > m){
                System.out.print(n +" is th largest number");    
              }else{
                 System.out.print(m + " is th largest number");   
              }
          
        }
    
      public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       largestNumber(n,m);
    }
}

output:
23
45

45 is largest number