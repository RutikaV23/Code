import java.util.*;
public class Discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("YOU ARE THE Price ");
        int n = sc.nextInt();
        System.ou.println("YOU ARE THE STUDENT : 1:YES  2:NO ");
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("YES");
                   StudentDiscount();
            break;

            case 2:System.out.println("NO ");
                  Discount();
            break;
        }
    }
}
