package order;


import components.*;
import exception.InvalidOrderNumberException;
import org.apache.log4j.Logger;
import person.Customer;
import person.Employee;
import exception.InvalidNameException;

import java.util.ArrayList;

public class Order {
    int orderNumber;
    private ArrayList<Component> componentList = new ArrayList<Component>();
    Customer customer;
    Employee employee;
    Component component;
    private static final Logger LOGGER = Logger.getLogger("Order Log");

    public Order(int orderNumber, Customer customer, Employee employee, ArrayList<Component> componentList ) {
//        try {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.employee = employee;
        this.componentList = componentList;
        }
    public ArrayList<Component> getComponentList(){
        return componentList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", employee=" + employee +
                ", component=" + component +
                '}';
    }

    public static void validateOrderNumber(int orderNumber) throws InvalidOrderNumberException {
        if (orderNumber<0){
            throw new InvalidOrderNumberException("Order Number cannot be negative");
        }
    }
}
