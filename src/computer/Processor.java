package computer;

public class Processor extends Computer{
    int cores;
    String brand;
    Boolean componentFault;

    public Processor(int computerId, String fault, int cores, String brand, Boolean componentFault) {
        super(computerId, fault);
        this.cores = cores;
        this.brand = brand;
        this.componentFault = componentFault;
    }
}
