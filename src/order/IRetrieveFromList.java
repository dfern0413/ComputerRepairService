package order;
import person.Customer;
import person.Employee;

public interface IRetrieveFromList {
    Customer RetrieveCustomerFromList(int customerNumber);
    Employee RetrieveEmployeeFromList(int employeeNumber);

}
