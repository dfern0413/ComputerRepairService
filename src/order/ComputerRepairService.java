package order;

import org.apache.log4j.Logger;
import person.Customer;
import person.Employee;

import java.util.ArrayList;
import java.util.List;

public final class ComputerRepairService implements IAddService, IShowOrders, IRemoveFromService, IRetrieveFromList {
    //static Order[] orderBin = {};
    static List<Order> orderList = new ArrayList<>();
    static List<Customer> customerList = new ArrayList<>();
    static List<Employee> employeeList = new ArrayList<>();
    private static final Logger LOGGER = Logger.getLogger("Computer Repair Service Log");



    // Add orders, customers, employees
    @Override
    public void AddOrder(Order order) {
        orderList.add(order);
    }
    @Override
    public void AddCustomer(Customer customer) { customerList.add(customer); }
    @Override
    public void AddEmployee(Employee employee) { employeeList.add(employee); }

    @Override
    public void showOrderList() {
        //int j = listOrder.size();
       // System.out.println(listOrder);
        System.out.println("Order List: ");
        for(int i = 0; i < orderList.size(); i++){
            System.out.println(orderList.get(i));
            LOGGER.info(orderList.get(i));
        }

    }

    @Override
    public void RemoveFromOrderList(Order order) { orderList.remove(order); }
    @Override
    public void RemoveFromCustomerList(Customer customer) { customerList.remove(customer); }
    @Override
    public void RemoveFromEmployeeList(Employee employee) { employeeList.remove(employee); }

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
}
