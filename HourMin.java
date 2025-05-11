//convert the given minutes in hours and remaning minutes
import java.util.*;

public class HourMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int m = sc.nextInt();
        while(m>60){
            m = m - 60;
            count++;       
        }
        System.out.println("Hour is : " + count + " and Minutes is : " + m);
    }
}