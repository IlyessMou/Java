import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;
        
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.0;
        
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.0;
        
        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.5;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0;
        order1.ready = false;
        order1.items = new ArrayList<Item>();
        
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0;
        order2.ready = false;
        order2.items = new ArrayList<Item>();
        
        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0;
        order3.ready = false;
        order3.items = new ArrayList<Item>();
        
        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0;
        order4.ready = false;
        order4.items = new ArrayList<Item>();
    
        //Application Simulations
        
        //Print the order1 variable
        System.out.printf("Name: %s\n", order1.name);
        
        //Prediction
        System.out.printf("Total: %s\n", order1.total);  // we should get 0.0 because no items are added yet
        System.out.println("********************************************************");

        //Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price; 
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.println("********************************************************");

        //Noah ordered a cappuccino
        order3.items.add(item4);
        order3.total += item4.price;  
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.println("********************************************************");

        //Sam added a latte
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready); 
        System.out.println("********************************************************");

        //Cindhuri's order is ready
        order1.ready = true;
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println("********************************************************");

        //Sam ordered 2 more lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.println("********************************************************");
        //Jimmy's order is now ready
        order2.ready = true;
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
