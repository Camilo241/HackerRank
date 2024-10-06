package Java.Basico;

import java.util.Scanner;

public class FormatoStr {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int C = A.length() + B.length();
        int la = A.charAt(0);
        int lb = B.charAt(0);
        sc.close();
        System.out.println(C);
        if (la > lb) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase()+ A.substring(1).toLowerCase()+ " " + B.substring(0,1).toUpperCase()+ B.substring(1).toLowerCase());
        
        
        
    }
}
