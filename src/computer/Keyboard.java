package computer;

public class Keyboard extends Computer{
    String type;
    String brand;
    Boolean componentFault;

    public Keyboard(int computerId, String fault, String type, String brand, Boolean componentFault) {
        super(computerId, fault);
        this.type = type;
        this.brand = brand;
        this.componentFault = componentFault;
    }
}
