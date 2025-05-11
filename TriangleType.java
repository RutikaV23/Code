//find the triangle type
import java.util.*;
public class TriangleType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println("Ii is Equilateral Triangle");
        }else if(a == b && b != c){
            System.out.println("Ii is Isoceles Triangle");
        }else{
            System.out.println("Ii is Scalen Triangle");

        }
    }
}