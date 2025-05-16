//print the number from 1 to n  using while loop

import java.util.*;

public class ReverseOneToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number");
        int n = sc.nextInt();
        while(n>0){
            System.out.print(n + " ");
            n--;
        }
    }
}