
import cost.PartsCost;
import order.IProcessOrder;
import order.Order;
import person.Customer;
import person.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create Order
        Order order1 = new Order(1, "Mike", "Jeff", "keyboard", "DELL");
        Order order2 = new Order(2, "Antonio", "Jeff", "speaker", "Sony");
        PartsCost partsCost = new PartsCost();
        System.out.println(order1.toString());

        if(order1.equals(order1)){
            System.out.println("ERROR: Same Order");
        }

        //Process
        String brokenPart;
        brokenPart = order1.processOrder();
        System.out.println(brokenPart);

        //Calculate Value
        int cost;
        cost = partsCost.repairPartCost(brokenPart);
        System.out.println(cost);


        // Customers



    }


}
