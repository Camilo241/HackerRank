import java.util.*;

public class DiaOcho {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>(n);
        for(int i = 0; i < n; i++){
            String name = in.next().toLowerCase();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
            in.nextLine();
        }

        while(in.hasNext()){
            String name = in.nextLine().trim().toLowerCase();
            if (name.isEmpty()) break;  // Handle empty lines or EOF conditions

            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        
        }
        in.close();
    }
    
}
