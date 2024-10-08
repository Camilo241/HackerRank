package Java.Basico;

import java.util.Scanner;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if(order.equals("cake")){
            return new Cake();
        }else{
            return new Pizza();
        }
    }
}

public class Patron_Fabrica {
    public static void main(String args[]) {
        

        try {

            Scanner sc = new Scanner(System.in);
            // creating the factory
            FoodFactory foodFactory = new FoodFactory();

            // factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
            sc.close();
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
            
        }
        
    }

}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    
}
