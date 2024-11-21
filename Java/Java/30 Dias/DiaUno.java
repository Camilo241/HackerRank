import java.util.*;


public class DiaUno {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        double doble = scan.nextDouble();
        scan.nextLine();
        String cadena = scan.nextLine();
        
        int suma = numero + i;
        double sumad = doble + d;
        String sumac = (s + cadena);
        System.out.println(suma);
        System.out.println(sumad);
        System.out.println(sumac);

        

        scan.close();
    }
}

