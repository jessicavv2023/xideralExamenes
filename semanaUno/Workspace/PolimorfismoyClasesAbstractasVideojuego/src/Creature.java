
//Clase base
abstract class Creature {
	
	//Metodos abstractos 
    public abstract void attack();

    public abstract void makeSound();

	public abstract  void fly();
		
		


	
}

//Al ser clase abstracta no es necesario implementar los metodos abstractos de Creature
abstract class Animal extends Creature {
}

//
abstract class Human extends Creature implements Flyable {
	
	
}

