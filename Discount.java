import java.util.*;


public class Discount{

public static void StudentDiscount(int price){
   double Discount;
   if(price>500){
     Discount = price * 0.25;
   }else{
     Discount = price * 0.10;
   }
   double total = price - Discount; 
   System.out.println("Amount paid :"+total );
}
public static void  NoDiscount(int price){
    double Discount;
   if(price>500){
     Discount = price * 0.15;
   }else{
     Discount = 0;
   }
   double total = price - Discount; 
   System.out.println("Amount paid :"+total );

}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter THE Price ");
        int price = sc.nextInt();
        System.out.println("YOU ARE THE STUDENT : 1:YES  2:NO ");
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("YES");
                   StudentDiscount(price);
            break;

            case 2:System.out.println("NO ");
                  NoDiscount(price);
            break;
        }
    }
}
