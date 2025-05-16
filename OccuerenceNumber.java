//print number occuerence
import java.util.*;

public class OccuerenceNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
       
        System.out.println("Enter the digit to find: ");
        int find = sc.nextInt();
        
        int count = 0;
        //int temp = num;
        
       while(num>0){
        int a = num%10;
        if(a == find){
            count++;
        }
        num = num/10;
       }
                System.out.println("The digit " + find + " occurs " + count );

    }
}
