import java.io.*;


class Result {

    

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    double tip = (meal_cost * tip_percent)/100;
    double tax =(meal_cost * tax_percent)/100;
    Double costototal = meal_cost + tip + tax;
    int resondeado = (int)Math.round(costototal);
    
    System.out.println((resondeado));
    }

}

public class DiaDos {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
