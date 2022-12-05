package components;

public class Cpu extends Component{
    int cores;

    public Cpu(String name, String model, int issue, int cores) {
        super(name, model, issue);
        this.cores = cores;
    }

}
