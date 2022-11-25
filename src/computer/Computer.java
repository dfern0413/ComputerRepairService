package computer;

public class Computer {
    private int computerId;
    String fault;

    public Computer(int computerId, String fault) {
        this.computerId = computerId;
        this.fault = fault;
    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }
}
