//print the number from 1 to n  using while loop

import java.util.*;

public class Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.err.println("Enter the number");
        int n = sc.nextInt();
        while(n>=i){
            System.out.print(i + " ");
            i++;
        }

    }
}