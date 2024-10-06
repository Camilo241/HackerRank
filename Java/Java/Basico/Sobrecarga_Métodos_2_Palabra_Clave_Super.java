package Java.Basico;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
        
		String temp=super.define_me(); // super me sierve pa utilizar otra vez el metodo de la clase principal 

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}

public class Sobrecarga_Métodos_2_Palabra_Clave_Super {
    public static void main(String []args){
		@SuppressWarnings("unused")
        MotorCycle M = new MotorCycle();
    }
}
