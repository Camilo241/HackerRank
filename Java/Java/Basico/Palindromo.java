package Java.Basico;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "";
        sc.close();
        for (int i = 0 ; i < A.length(); i++) {
            B = A.charAt(i) + B; 
            System.out.println(B);
        }
        if (A.equals(B)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
    }
}
