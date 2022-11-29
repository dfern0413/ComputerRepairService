
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
        PartsCost partsCost = new PartsCost();

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
