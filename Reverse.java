//reverse number
import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int n = 245;
		int reversed = 0;
		//int n = sc.nextInt();
		while(n>0){
		   int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n/10;
	
	//	
		}System.out.println(reversed);
 }

}