package person;

import computer.Computer;

import java.util.ArrayList;
import java.util.Objects;

public class Customer extends Person {
    private ArrayList<Computer> repair;

    public Customer(String fullname, String emailAddress, ArrayList<Computer> repair) {
        super(fullname, emailAddress);
        setRepair(repair);
    }

    public ArrayList<Computer> getRepair() {
        return repair;
    }

    public void setRepair(ArrayList<Computer> repair) {
        this.repair = repair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return repair.equals(customer.repair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repair);
    }
}

