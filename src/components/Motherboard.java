package components;

public class Motherboard extends Component{
    int ramSlots;

    public Motherboard(String name, String model, int issue, int ramSlots) {
        super(name, model, issue);
        this.ramSlots = ramSlots;
    }
}
