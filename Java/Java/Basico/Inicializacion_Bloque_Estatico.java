package Java.Basico;
import java.util.*;
public class Inicializacion_Bloque_Estatico {

static int B;
static int H;
static boolean flag = true;
static{
Scanner sc = new Scanner(System.in);
B = sc.nextInt();
H = sc.nextInt();
flag = true;

if (B<= 0 || H<=0) {
    flag = false;  
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
sc.close();
}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

