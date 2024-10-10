public class KioskTest {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
        
        kiosk.addMenuItem("banana", 2.00);
        kiosk.addMenuItem("coffee", 1.50);
        kiosk.addMenuItem("latte", 4.50);
        kiosk.addMenuItem("capuccino", 3.00);
        kiosk.addMenuItem("muffin", 4.00);
        kiosk.addMenuItem("cake", 9.99);
        kiosk.addMenuItem("cookie", 6.75);
        kiosk.addMenuItem("brownie", 7.99);
        //ninja bonus
        kiosk.addMenuItemByInput();
        kiosk.newOrder();
    }
}
