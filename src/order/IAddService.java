package order;

import person.Employee;
import person.Customer;

public interface IAddService {
    void AddOrder(Order order);
    void AddCustomer(Customer customer);
    void AddEmployee(Employee employee);

}
