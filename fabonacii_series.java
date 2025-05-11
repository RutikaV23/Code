//fabonacii series 

import java.util.*;

class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y =1;
        System.out.print(x+" ");
        System.out.print(y);
        for(int i=1;i<n-1;i++){
            int sum = x + y;
            x = y;
            y = sum;
            System.out.print(" "+sum + " ");
            //System.out.print(x);
        }
    }
}

//output:
//5
//0 1 1 2 3