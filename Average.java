// find the average of three numbers using function
import java.util.*;
class Average {
    
    public static void average(int n,int m,int o){
        int avg = n+m+o ;
        System.out.println(avg);
        
    }
    
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int o = sc.nextInt();
       average(n,m,o);
    }
}


output:-
2
3
4

9
