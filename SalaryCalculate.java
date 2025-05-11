import java.util.*;
public class SalaryCalculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double da,ta,hra;
        if(n <= 5000){
            da = n * 0.10;
            ta = n * 0.20;
            hra = n * 0.25;
            System.out.println(" 10% da is: " + da + " 20% ta is: " + ta + " 25% hra is: " + hra);
        }else{
            da = n * 0.15;
            ta = n * 0.25;
            hra = n * 0.30;
            System.out.println(" 15% da is: " + da + " 25% ta is: "+ ta + " 30% hra is: " + hra);

        }
    }
}