/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

 public class Main{

    static int positive = 0;
    static int negative = 0;
    static int zero = 0;

    public static void number(int i){

        
        if(i>0){
        positive++ ;
        }
        else if(i<0){
         negative++; 
        }
        else{
        zero++;  
        }
    }
	public static void main(String[] args) {
	    int m = 1;
	    Scanner sc = new Scanner(System.in);
		
		while(m > 0){
		    
		    System.out.println("YOU WANT TO ENTER THE NUMBER");
		    System.out.println("1:YES 2:NO");
		    int n = sc.nextInt();
		
		switch(n){
		    case 1:
		          System.out.println("YES");
		          int i = sc.nextInt();
		          number(i);
		    break;
		    case 2: 
		        System.out.println("NO");
		        m = 0; 
		    break;
		    default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
            
		}
	  }
	  
	    System.out.println("Positive numbers entered: " + positive);
        System.out.println("Negative numbers entered: " + negative);
        System.out.println("Zeroes entered: " + zero);
   
	}
}


output:-
