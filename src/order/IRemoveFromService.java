package order;

import person.Customer;
import person.Employee;

public interface IRemoveFromService {
    void RemoveFromOrderList(Order order);
    void RemoveFromCustomerList(Customer customer);
    void RemoveFromEmployeeList(Employee employee);

}
