public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.0);
        Item item4 = new Item("cappuccino", 4.5);
        
        //Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        
        //Create 3 orders with custom names
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");
        
        //Adding items to orders
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item4);
        order5.addItem(item2);

        //Test getStatusMessage
        System.out.println(order1.getStatusMessage()); 
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());  
        
        //Test getOrderTotal
        System.out.println("Total: $" + order1.getOrderTotal());

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
