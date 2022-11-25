package computer;

public class MemoryRam extends Computer{
    int ramCapacity;
    String brand;
    Boolean componentFault;

    public MemoryRam(int computerId, String fault, int ramCapacity, String brand, Boolean componentFault) {
        super(computerId, fault);
        this.ramCapacity = ramCapacity;
        this.brand = brand;
        this.componentFault = componentFault;
    }
}
