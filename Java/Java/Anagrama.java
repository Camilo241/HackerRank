package Java;

import java.util.Scanner;

public class Anagrama {
    static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase and remove spaces
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();

        if(first.length != second.length) {
            return false;
        }

        int result = 0;

        for (int i = 0; i < first.length; i++) {
            result ^= (first[i] ^ second[i]);
        }
        return result == 0;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
