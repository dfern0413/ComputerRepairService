package orders;

public class Employee extends Orders {
    String assignedEmployee;

    @Override
    public String toString() {
        return "Employee{" +
                "assignedEmployee='" + assignedEmployee + '\'' +
                '}';
    }
}
