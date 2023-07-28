public class Main {
   
    
    public static void main(String[] args) {
      
        Creature dragon = new Dragon();
        Creature goblin = new Goblin();
        Creature humanOne = new HumanOne();
      
      
        System.out.println("Información del dragón:");
        dragon.attack();
        dragon.makeSound();
        System.out.println("-----------**************------------");

        System.out.println("Información del goblin:");
        goblin.attack();
        goblin.makeSound();
        System.out.println("-----------**************------------");

        System.out.println("Información del humano:");
        humanOne.attack();
        humanOne.makeSound();
        System.out.println("-----------**************------------");
       
    }
}
