public class CoffeeOrder { // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    String size; // - size (String)
    String type; // - type (String)
    private String orderID; // - orderID (String, make this one private)

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders;

    // TODO 4: Create a no-arg constructor
    CoffeeOrder(){
        this.size = "medium"; // Set size to "medium"
        this.type = "black"; // and type to "black"
        totalOrders++; // Increment totalOrders
    }

    // TODO 5: Create a constructor that takes a size only
    CoffeeOrder(String size){
        this.size = size;
        this.type = "black"; // Set type to "black" by default
        totalOrders++; // Increment totalOrders
    }

    // TODO 6: Create a constructor that takes size and type
    CoffeeOrder(String size, String type){
        this.size = size;
        this.type = type;
        totalOrders++; // Increment totalOrders
    }

    // TODO 7: Create a method describeOrder() that returns
     void describeOrder() {
        // something like "Order: medium black"
         size = this.size;
         type = this.type;
        System.out.println("--------------------\n\t\tORDER\t\n\n\t" + size + " " + type + "\n\n--------------------\n");
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static void getTotalOrders(){
        System.out.println("--------------------\n  Total Orders: " + totalOrders + "\n--------------------");
    }

}
