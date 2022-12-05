package person;


import java.util.ArrayList;
import java.util.Objects;

public class Customer extends Person {
    String emailAddress;

    public Customer(String fullname, String emailAddress) {
        super(fullname);
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return '{' + "name=" + getFullname() +
                " and emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

