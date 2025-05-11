import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int n = 245;
		int reversed = 0;
		//int n = sc.nextInt();
		while(n>0){
		   int digit = n % 10;
            reversed = reversed  + digit;
            n = n/10;
	
	//	System.out.println(res)
		//System.out.println(reversed);
		}System.out.println(reversed);
 }

}

output:-
234
432