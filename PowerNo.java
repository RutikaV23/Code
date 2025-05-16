//print the power of the number
import java.util.*;
public class PowerNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        System.out.println("Enter the number  : ");
        int num = sc.nextInt();
        
        System.out.println("Enter no  : ");
        int PowerNo = sc.nextInt();
       
       for(int i=0;i<PowerNo;i++){
          result = result * num;
       }
        System.out.println(num + " power of " + PowerNo + " is : " + result);

        }

    }
