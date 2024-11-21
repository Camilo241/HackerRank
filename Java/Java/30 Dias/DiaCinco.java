import java.io.*;

public class DiaCinco {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
            for (int i = 1; i < 11; i++) {
                int resultado = n * i;
                System.out.println(n + " x " + i + " = " + resultado);
            }
        bufferedReader.close();
    }    
}
