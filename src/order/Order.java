package order;

import date.Date;

public class Order {
    int orderNumber;
    String faultyComponent;
    String date;

    public Order(int orderNumber, String faultyComponent, String date) {
        this.orderNumber = orderNumber;
        this.faultyComponent = faultyComponent;
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getFaultyComponent() {
        return faultyComponent;
    }

    public void setFaultyComponent(String faultyComponent) {
        this.faultyComponent = faultyComponent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
