package order;


import components.Component;
import components.Cpu;
import person.Customer;
import person.Employee;

public class Order implements IMakeComponent, IProcessOrder{
    int orderNumber;

    @Override
    public String processOrder(Order order) {
        return IProcessOrder.super.processOrder(order);
    }

    Customer customer;
    Employee employee;
    Component component;


    public Order(int orderNumber, Customer customer, Employee employee, Component component) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.employee =  employee;
        this.component = component;


    }



    @Override
    public Component MakeComponent(Component component) {
        return IMakeComponent.super.MakeComponent(component);
    }
//    @Override
//    public String processOrder(Order order) {
//
//        if(component.getName()== "Cpu"){
//            return "Cpu";
////            if(component.getModel() == "Intel") {
////                if (component.getIssue() == 1) {
////                    Cpu cpu = new Cpu(component.getName(), component.getModel(), component.getIssue(), 4);
////
////
////                } else if (component.getIssue() == 2) {
////                    Cpu cpu = new Cpu(component.getName(), component.getModel(), component.getIssue(), 6);
////                }
////            }
////        }else if (component.getName()== "Keyboard") {
////            if(component.getName() == "Keyboard"){
////                System.out.println("KEYBOARD");
////            }
////
////        } else if (component.getName()== "Motherboard") {
////            if(component.getName() == "Motherboard"){
////                System.out.println("KEYBOARD");
////            }
////
////        } else if (component.getName()== "Ram") {
////            if(component.getName() == "Keyboard"){
////                System.out.println("KEYBOARD");
////            }
////
////        } else if (component.getName() == "Storage") {
////            if(component.getName() == "Keyboard"){
////                System.out.println("KEYBOARD");
////            }
//
//        }else
//            System.out.println("Error Not a component");
//            return null;
//
//    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", employee=" + employee +
                ", component=" + component +
                '}';
    }



}
