package components;

public class Cpu extends Component{
    int cores;

    public Cpu(String name, String model, int issue, int cores) {
        super(name, model, issue);
        this.cores = cores;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cores=" + cores +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", issue=" + issue +
                '}';
    }
}
