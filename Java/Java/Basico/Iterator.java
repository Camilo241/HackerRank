package Java.Basico;

import java.util.*;

public class Iterator {
    @SuppressWarnings("rawtypes")
    static java.util.Iterator func(ArrayList mylist) {
        java.util.Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
        if(element instanceof Integer){
            continue;
        }else

            break;
        }
        return it;

    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        @SuppressWarnings("rawtypes")
        java.util.Iterator it = func(mylist);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
        sc.close();
    }
}
