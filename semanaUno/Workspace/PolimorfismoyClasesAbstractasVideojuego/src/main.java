public class main {
    public static void Encounter(Creature creature) {
        creature.attack();

        if (creature instanceof Animal) {
            ((Animal) creature).attack();
        } else if (creature instanceof Human) {
            ((Human) creature).makeSound ();
        }
    }

    public static void main(String[] args) {
        // Simulación del encuentro con criaturas
        Creature dragon = new Dragon();
        Creature goblin = new Goblin();
        Creature human = new Human();

        Encounter(dragon);
        System.out.println("**************");
        Encounter(human);
        System.out.println("**************");
        Encounter(goblin);
    }
}
