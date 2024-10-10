public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();

        bat.attackTown();
        System.out.println("****************************************");
        bat.eatHumans();
        bat.eatHumans();

        System.out.println("****************************************");

        bat.fly();
        bat.fly();

        System.out.println("****************************************");
        bat.displayEnergy();
    }
}
