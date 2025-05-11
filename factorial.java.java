import java.util.*;
class Main {
    
    public static void Factorial(int n){
        if(n<0){
            System.out.println("invalid number");
        }
        int sum = 1;
        for(int i=0;i<5;i++){
            sum = sum * (n-i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);
    }
}