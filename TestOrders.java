import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4.0;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.5;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;
        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 3.0;
        // Order variables -- order1, order2 etc.


        ArrayList<String> itmess1 = new ArrayList<String>();
        ArrayList<String> itmes2 = new ArrayList<String>();
        ArrayList<String> itmes3 = new ArrayList<String>();
        ArrayList<String> itmes4 = new ArrayList<String>();

        items2.add(item1.name);
        items3.add(item4.name);
        items4.add(item3.name);
        items4.add(item2.name);
        items4.add(item2.name);

        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0;
        order1.ready = true;
        order1.items = itemss1;
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 4.0;
        order2.ready = true;
        order2.items = items2;
        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 3.0;
        order3.ready = false;
        order3.items = items3;
        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 2.5;
        order4.ready = false;
        order4.items = items4;
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}