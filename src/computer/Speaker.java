package computer;

public class Speaker extends Computer{
    String brand;
    String type;
    Boolean componentFault;

    public Speaker(int computerId, String fault, String brand, String type, Boolean componentFault) {
        super(computerId, fault);
        this.brand = brand;
        this.type = type;
        this.componentFault = componentFault;
    }


}
