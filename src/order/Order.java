package order;


import components.Component;
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

    public Order(int orderNumber, Customer customer, Employee employee, ArrayList<Component> componentList ) throws InvalidNameException {
        try {
            this.orderNumber = orderNumber;
            this.customer = customer;
            this.employee = employee;
            this.componentList = componentList;
            ValidatePersonName();
        }catch (Exception e){
            LOGGER.fatal("Error: " + e);
        }
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
    public void ValidatePersonName() throws InvalidNameException {
        if(customer.getFullname().equals("")){
            throw new InvalidNameException("Name Cannot be blank");
        }
    }

}
