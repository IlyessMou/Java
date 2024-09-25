public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        double mochaPrice = 6;
        double coffeePrice = 3.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.35;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true; 
        boolean isReadyOrder3 = true; 
        boolean isReadyOrder4 = true; 
    
        // APP INTERACTION SIMULATION
        // Cindhuri
        System.out.println("☕********************************☕");
        System.out.println(generalGreeting + customer1); 
        if (!isReadyOrder1) {
            System.out.println(customer1 + pendingMessage); 
        } else {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice); 
        }
        
        // Noah
        System.out.println("☕********************************☕");
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice); 
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam
        System.out.println("☕********************************☕");       
        System.out.println(generalGreeting + customer2);
        if (!isReadyOrder2) {
            System.out.println(customer2 + pendingMessage);
        } else {
        System.out.println(customer2 + readyMessage);
        System.out.println(displayTotalMessage + (2 * lattePrice));
        }
    
        // Jimmy
        System.out.println("☕********************************☕");
        System.out.println(generalGreeting + customer3);
        if (!isReadyOrder3) {
            System.out.println(customer3 + pendingMessage);
        }else{
        System.out.println("Sorry for the mistake "+customer3);
        System.out.println(customer3 + readyMessage);
        System.out.println(displayTotalMessage + (lattePrice - coffeePrice)); 
        }
    }
}

