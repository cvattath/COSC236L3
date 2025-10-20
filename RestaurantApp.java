package restaurant;
// Main class to demonstrate collaboration
public class RestaurantApp {
    public static void main(String[] args) {
        // Edited customer, changing name from Alice to Bob
        Customer customer = new Customer("Bob");
        
        // Edited Menu items with +1 dollar added onto the prices
        MenuItem pizza = new MenuItem("Pizza", 8.99 + 1.00);
        MenuItem burger = new MenuItem("Burger", 5.49 + 1.00);
        MenuItem soda = new MenuItem("Soda", 1.99 + 1.00);
        
        // Changed to .addToOrder to reflect changes in the Order class
        customer.addToOrder(pizza);  // Collaborating with MenuItem and Order
        customer.addToOrder(burger);
        customer.addToOrder(soda);
        
        // Customer places the order
        customer.placeOrder();  // Collaborating with Order to show order summary
    }
}
