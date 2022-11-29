package order;


import person.Employee;
import person.Person;

public class Order implements IProcessOrder {
    int orderNumber;
    String customer;
    String employee;
    String part;
    String brand;

    public Order(int orderNumber, String customer, String employee, String part, String brand) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.employee = employee;
        this.part = part;
        this.brand = brand;
    }




    @Override
    public String processOrder() {
        return part;
    }
}
