import java.util.*;


//Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that //username to the user.

class Main {
    public static void main(String[] args) {
    
     Scanner sc = new Scanner (System.in);
     String str = sc.next();
     String result = "";


     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == '@') {
         result += ' ';
         break;
       } 
       else {
        result += str.charAt(i);
       }
     }


     System.out.println(result);
    
    }
}

output-
rutika@gmail.com
rutika

