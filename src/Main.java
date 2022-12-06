
import components.Component;
import components.Cpu;
import components.Keyboard;
import exception.InvalidNameException;
import order.ComputerRepairService;
import order.Order;
import person.Customer;
import person.Employee;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) throws InvalidNameException {

        // ArrayList of Components
        ArrayList<Component> componentList1 = new ArrayList<Component>();
        componentList1.add(new Cpu("Cpu", "Intel", 101, 4));
        componentList1.add(new Keyboard("Keyboard", "Alienware", 202, "BGR"));

        //Create class to contain ArrayList orderList, customerList, employeeList
        ComputerRepairService computerRepairService = new ComputerRepairService();

        // computerRepairService.AddOrder(order1);
        // Employees
        computerRepairService.AddEmployee(new Employee("Mike Jame", 100));
        computerRepairService.AddEmployee(new Employee("Juan Peepe", 102));
        // Customers
        computerRepairService.AddCustomer(new Customer("Louis Parker", "lp02@gmail.com"));
        computerRepairService.AddCustomer(new Customer("Ming Perez", "mp0405@yahoo.com"));

        //Create Order
        Order order1 = new Order(0, computerRepairService.RetrieveCustomerFromList(0) ,
                computerRepairService.RetrieveEmployeeFromList(0), componentList1);

        Order order2 = new Order(1, new Customer("Pepe", "pepe2@yahoo.com"),
                new Employee("", 2), componentList1);

        //Add orders to Computer Service
        computerRepairService.AddOrder(order1);



        // Ask about showOrderList()
        // Ask about calculating prices, not sure how to determine component parameters in component ArrayList

        computerRepairService.showOrderList();








        //Calculate Value




    }


}
