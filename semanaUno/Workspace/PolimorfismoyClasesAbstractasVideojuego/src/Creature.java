abstract class Creature {
	
    public abstract void attack();

    public abstract void makeSound();
}

abstract class Animal extends Creature {
    public abstract void makeSound();
}


abstract class Human extends Creature  {
   
    public void attack() {
       
    }

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
    
}