public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        gorilla.throwSomething();
        gorilla.throwSomething();
        System.out.println("*************************");

        gorilla.eatBananas();
        System.out.println("*************************");

        gorilla.climb();
        gorilla.climb();
        gorilla.climb();
        System.out.println("*************************");

        gorilla.displayEnergy();
    }
}
