//print the number  1st and last  digit sum

import java.util.*;

public class FirstLastSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();
        }
         int sum = arr[0] + arr[size-1]; 
         System.err.println("sum is : "+ sum);
        
        System.out.println("first is : " + arr[0] + " last is : "+ arr[size-1]);

         int temp = arr[0];
         arr[0] = arr[size-1];
         arr[size-1] = temp;
        System.out.println("Swap the Element");
        System.out.println("first is : " + arr[0] + " last is : "+ arr[size-1]);
        

    }
}