package Java.Basico;

import java.util.Scanner;

public class Comparacion_Substrings {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; i < s.length(); i++) {
            
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(s.substring(k));
        // System.out.println(getSmallestAndLargest(s, k));
    }

}
