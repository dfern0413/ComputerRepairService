package order;

import components.*;
import org.apache.log4j.Logger;
import person.Customer;
import person.Employee;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepairService implements IRemoveFromService, IRetrieveFromList {
    static List<Order> orderList = new ArrayList<>();
    static List<Customer> customerList = new ArrayList<>();
    static List<Employee> employeeList = new ArrayList<>();
    static int orderAmount = 0;
    private static final Logger LOGGER = Logger.getLogger("Computer Repair Service Log");

    // Add orders, customers, employees
    public static void addOrder(Order order) {
        orderList.add(order);
    }
    public static void increaseOrderAmount(){ orderAmount += 1; }
    public static void addCustomer(Customer customer) { customerList.add(customer); }
    public static void addEmployee(Employee employee) { employeeList.add(employee); }
    // Show Lists
    public static void showOrderList() {
        System.out.println("Order List: ");
        for(int i = 0; i < orderList.size(); i++){
            //System.out.println(orderList.get(i));
            LOGGER.info(orderList.get(i));
            // Make it like table, use toString
        }
    }
    public static void showEmployeeList() {
        System.out.println("Employee List: ");
        for(int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i));
            LOGGER.info(employeeList.get(i));
            // Make it like table, use toString
        }
    }

    // Remove From ArrayLists:
    public static void removeFromOrderList(int orderNumber) { orderList.remove(orderNumber); }
    @Override
    public void RemoveFromCustomerList(Customer customer) { customerList.remove(customer); }
    @Override
    public void RemoveFromEmployeeList(Employee employee) { employeeList.remove(employee); }
    // Getter and Setters:
    public static List<Order> getOrderList() {
        return orderList;
    }

    public static void setOrderList(List<Order> orderList) {
        ComputerRepairService.orderList = orderList;
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        ComputerRepairService.customerList = customerList;
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        ComputerRepairService.employeeList = employeeList;
    }

    @Override
    public Customer RetrieveCustomerFromList(int customerNumber) {
        return customerList.get(customerNumber);
    }

    @Override
    public Employee RetrieveEmployeeFromList(int employeeNumber) {
        return employeeList.get(employeeNumber);
    }

    public static int repairPartCost(ArrayList<Component> componentList) {
        int totalCost = 0;
        for(int i = 0; i < componentList.size(); i++) {
            if (componentList.get(i).getName() == "Cpu") {
                Cpu holder = (Cpu) componentList.get(i);
                int partCost = holder.getCpuCost();
                totalCost += partCost;
            } else if (componentList.get(i).getName() == "Keyboard") {
                Keyboard holder = (Keyboard) componentList.get(i);
                int partCost = holder.getKeyboardCost();
                totalCost += partCost;
            } else if (componentList.get(i).getName() == "Motherboard") {
                Motherboard holder = (Motherboard) componentList.get(i);
                int partCost = holder.getMotherboardCost();
                totalCost += partCost;
            } else if (componentList.get(i).getName() == "Ram") {
                Ram holder = (Ram) componentList.get(i);
                int partCost = holder.getRamCost();
                totalCost += partCost;
            } else if (componentList.get(i).getName() == "Storage") {
                Storage holder = (Storage) componentList.get(i);
                int partCost = holder.getStorageCost();
                totalCost += partCost;
            }
        }
        return totalCost;
    }

    public static int getOrderAmount() {
        return orderAmount;
    }
}
