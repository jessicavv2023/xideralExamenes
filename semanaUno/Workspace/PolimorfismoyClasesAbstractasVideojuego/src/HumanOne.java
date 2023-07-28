
public  class HumanOne extends Creature implements Flyable{
	
	@Override
	public void attack() {
        System.out.println("El humano saca su espada.");
    }
	@Override
	public void makeSound() {
        System.out.println("Rawwww");
    }
	@Override
    public void fly() {
        System.out.println("Super poder para volar ");
    }
}

