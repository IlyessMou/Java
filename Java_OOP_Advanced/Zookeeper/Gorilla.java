public class Gorilla extends Mammal {
    
    //throwing something(-5)
    public void throwSomething() {
        energy -= 5;
        System.out.println("Gorilla has thrown something! 💥🦍");
    }

    //eating bananas (+10)
    public void eatBananas() {
        energy += 10;
        System.out.println("Gorilla is satisfied!! 🍌🦍");
    }

    //climbing a tree (-10)
    public void climb() {
        energy -= 10;
        System.out.println("Gorilla has climbed a tree! 🌳🦍");
    }
}
