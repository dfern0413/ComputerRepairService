
import components.Component;
import order.Bin;
import order.IProcessOrder;
import order.Order;
import person.Customer;
import person.Employee;

public class Main  {
    public static void main(String[] args)  {
        //Create Order
        Order order1 = new Order(0, new Customer("Juan", "ford@gmail"),
                    new Employee("Antonio", 1), new Component("Cpu", "Intel", 10223));
        Order order2 = new Order(1, new Customer("Pepe", "pepe2@yahoo.com"),
                    new Employee("Mark", 2), new Component("Storage", "Intel", 2988));

        //Create a bin to keep order in ArrayList
        Bin bin = new Bin();
        //Add to bin
        bin.AddToBin(order1);
        bin.AddToBin(order2);
        bin.showOrderList();
        bin.RemoveFromBin(order2);
        bin.showOrderList();



        //Calculate Value




    }


}
