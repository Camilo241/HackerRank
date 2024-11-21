import java.io.*;

public class DiaDiez {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binaryString = Integer.toBinaryString(n);
        int maxConsecutiveOnes = 0;
        int currentCount = 0;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                currentCount++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentCount);
            } else {
                currentCount = 0;
            }
        }
        System.out.println(maxConsecutiveOnes);

        bufferedReader.close();
    }

}
