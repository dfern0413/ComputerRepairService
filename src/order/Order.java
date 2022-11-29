package order;


import person.Employee;
import person.Person;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer='" + customer + '\'' +
                ", employee='" + employee + '\'' +
                ", part='" + part + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && customer.equals(order.customer) && employee.equals(order.employee) && part.equals(order.part) && brand.equals(order.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, customer, employee, part, brand);
    }
}
