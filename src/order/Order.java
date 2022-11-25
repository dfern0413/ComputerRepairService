package order;

import date.Date;

public class Order {
    int orderNumber;
    String faultyComponent;
    String date;

    public Order(int orderNumber, String faultyComponent, String date) {
        this.orderNumber = orderNumber;
        this.faultyComponent = faultyComponent;
    }
}
