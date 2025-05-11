//check age
import java.util.*;
public class CheckAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(
            System.in
        );
        int age = sc.nextInt();
        if(age < 0){
           System.out.println("Invalid Number");
        }
        else if(age < 12){
           System.out.println("Child");
        }else if(12 < age && age <19){
          System.out.println("Child");
        }else if(20 < age && age < 59){
          System.out.println("Adult ");
        }else if(60 < age){
          System.out.println("Senior");
        }
        
    }
}