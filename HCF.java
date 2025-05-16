import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();       //36
        int n2 = sc.nextInt();       //60  

        int a = n1;                  //36
        int b = n2;                  //60

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;           //60
            b = a % b;     
            System.out.println("b"+ b);          //0.6
            a = temp; 
            System.out.println("a"+ a);              //60 
        }

        System.out.println("HCF of " + n1 + " and " + n2 + " is: " + a);
        
    }
}
