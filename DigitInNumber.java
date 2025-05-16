
import java.util.Scanner;

//print digit in number  using while loop

public class DigitInNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int a = n%10;
            count++;
            n = n/10;
            
        } System.out.print(" The digit in Number : " + count );
    }
}