public class Main {
   
    //Metodo estatico 
    public static void main(String[] args) {
         
    	//Se crea una variable llamda dragon de tipo Creature
    	//y se asigna a una instancia (objeto)llamda Dragon 
        Creature dragon   = new Dragon();
        Creature goblin   = new Goblin();
        Creature humanOne = new HumanOne();
        Flyable  escudo   = new Escudo();
        
      
        System.out.println("Información del dragón:");
        
        //comportamiento de los metodos 
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
        humanOne.fly();
   
        System.out.println("-----------**************------------");
        
        System.out.println("Información del escudo:");
        escudo.fly();
        
    }
}
