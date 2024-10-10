import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // The addMenuItem method should create a new item object with the given name and price.
    // Add the new Item object to the menu items array.
    // The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(this.menu.size()); 
        this.menu.add(newItem);
    }

    // Now with an array of items you can display the menu without needing separate arrays of names and prices!
    public void displayMenu() {
        for(Item item : this.menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    // Create a new order based on user input
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order newOrder = new Order(name);
        // Show the user the menu, so they can choose items to add.
        this.displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            int index = Integer.parseInt(itemNumber);
            Item orderedItem = this.menu.get(index);
            newOrder.addItem(orderedItem);
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Item added: " + orderedItem.getName());
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        newOrder.display();
        this.orders.add(newOrder);
    }


    // Bonus ninja
    public void addMenuItemByInput() {
        System.out.println("Enter new menu item name:");
        String itemName = System.console().readLine();
        
        System.out.println("Enter price for " + itemName + ":");
        double itemPrice = Double.parseDouble(System.console().readLine());
        
        addMenuItem(itemName, itemPrice);
        System.out.println("New item added to menu.");
    }
}
