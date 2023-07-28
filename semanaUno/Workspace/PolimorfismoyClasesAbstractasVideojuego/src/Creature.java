//Clase base
abstract class Creature {
	
	//Metodos abstractos 
    public abstract void attack();

    public abstract void makeSound();
}

//Al ser clase anstracta no es necesario implementar los metodos abstractos de Creature
abstract class Animal extends Creature {
    
}

//
abstract class Human extends Creature  {
   
    
}