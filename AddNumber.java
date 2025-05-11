import java.util.*;
public class AddNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the size of number:  ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
           arr[i] = n%10;
           n = n/10;
        }
        int sum = arr[0] + arr[size-1];
        System.out.println("sum is: "+ sum);
    }
}