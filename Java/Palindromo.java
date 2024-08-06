package Java;

import java.io.*;
import java.util.*;

public class Palindromo {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    StringBuilder sb=new StringBuilder(A);
    String reversa=sb.reverse().toString();
    

    if (A.equals(reversa)) {
        System.out.println("Es un Palindromo");
    } else {
        System.out.println("No es un Palindromo");
    }
    
    }
}