//print the number from 1 to n  using while loop

import java.util.*;

public class ASCIINO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        for(int i=0;i<=255;i++){
       System.out.println("The Ascii value " + (char)i + " is " + i );
        }

    }
}