package components;

public class Storage extends Component{
    int size;

    public Storage(String name, String model, int issue, int size) {
        super(name, model, issue);
        this.size = size;
    }


}
