import java.util.Scanner;

public class DiaDieciSiete {

    
        
        int power(int n, int p){
            if (n < 0 || p < 0) {
                throw new RuntimeException("n and p should be non-negative");
            }else{
                return (int) Math.pow(n, p);
            }
        }
        
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            DiaDieciSiete myCalculator = new DiaDieciSiete();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
