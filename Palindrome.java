import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OG = n;
        int num = 0;
        int a = 0;
        while(n>0){
        a = n % 10;
        n = n / 10 ;
        num = num * 10 + a;
      }
        if(num == OG){
            System.err.println(OG + " is a Palindrome Number");
        }else{
            System.err.println(OG + " is not a Palindrome Number");
        }
        
    }
}