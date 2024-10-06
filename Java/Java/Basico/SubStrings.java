package Java.Basico;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start,end));
    }
}
