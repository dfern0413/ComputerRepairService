import computer.Computer;
import computer.Speaker;
import person.Customer;
import person.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> repairsList = new ArrayList<Computer>();
        Computer computer1 = new Speaker(1, "Does not turn on", "Sony", "Wireless", true);
        repairsList.add(computer1);

        printRepairs(repairsList);

        // Customers
        Person person1 = new Customer("Alex John", "lork@gmail.com", repairsList);
        System.out.println(person1);


    }

    public static void printRepairs(ArrayList<Computer> repairsList) {

        for (int i = 0; i < repairsList.size(); i++) {
            System.out.println("Computer repair: " + i + repairsList.get(i));
        }
    }
}
