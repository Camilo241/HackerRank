import java.util.*;
import java.io.*;

class LOOPSII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            // Generating the series
        for (int j = 0; j < n; j++) {
            sum += b * Math.pow(2, j);
            System.out.print(sum + " ");
        }
        System.out.println();  // Move to the next line for the next query
    }
    in.close();
}
}
