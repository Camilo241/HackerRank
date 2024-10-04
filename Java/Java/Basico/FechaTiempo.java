package Java.Basico;

import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
         Calendar calendar = new GregorianCalendar(year, month - 1, day);
         int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
         String dayToPrint = ""; 
         switch(dayOfWeek) { 
             case 1 : dayToPrint = "MONDAY";
                break;
            case 2 : dayToPrint = "TUESDAY";
                break;
            case 3 : dayToPrint = "WEDNESDAY";
                break;
            case 4 : dayToPrint = "THURSDAY";
                break;
            case 5 : dayToPrint = "FRIDAY";
                break;
            case 6 : dayToPrint = "SATURDAY";
                break;
            default : dayToPrint = "SUNDAY"; }

   return dayToPrint;

}
    

}

public class FechaTiempo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
