package components;

public class Motherboard extends Component{
    int ramSlots;

    public Motherboard(String name, String model, int issue, int ramSlots) {
        super(name, model, issue);
        this.ramSlots = ramSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "ramSlots=" + ramSlots +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", issue=" + issue +
                '}';
    }
}
