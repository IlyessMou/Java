public class Bat extends Mammal {
    public Bat() {
        this.energy = 300;
    }

    //flying (-50)
    public void fly() {
        energy -= 50;
        System.out.println("Bat is flying! ");
    }

    //eating humans (+25)
    public void eatHumans() {
        energy += 25;
        System.out.println("Bat is satisfied!");
    }

    //attacking a town (-100)
    public void attackTown() {
        energy -= 100;
        System.out.println("Bat is attacking the town!");
    }
}
