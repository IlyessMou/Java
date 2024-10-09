import java.util.ArrayList;

public class CafeUtil {

    // calculate the streak goal
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1;i<= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Ninja Bonus 1
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i=1;i<=numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    //calculate total price of order
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    //display the menu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i=0;i<menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    //add a customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

    //price chart
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i=1; i<= maxQuantity; i++) {
            double totalCost = price * i;
            System.out.printf("%d - $%.2f\n", i, totalCost);
        }
    }
}

