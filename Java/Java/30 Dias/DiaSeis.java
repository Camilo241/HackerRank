import java.util.Scanner;

public class DiaSeis {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        for (int i = 1; i <= n; i++) {
            s = in.next();
            for (int j = 0; j < s.length(); j = j + 2) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for (int k = 1; k < s.length(); k = k + 2) {
                System.out.print(s.charAt(k));
            }
            System.out.println();

        }
        in.close();        
    }

}
