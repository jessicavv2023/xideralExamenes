// Clase abstracta Creature
abstract class Creature {
    public abstract void attack();

	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
}

// Clase abstracta Animal que hereda de Creature
abstract class Animal extends Creature {
    public abstract void makeSound();
}

// Clase abstracta Human que hereda de Creature
abstract class Human extends Creature {
    public abstract void speak();
}

