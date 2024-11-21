import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiaDieciSeis {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            int n = Integer.parseInt(S);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
