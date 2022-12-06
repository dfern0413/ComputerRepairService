package components;



public class Storage extends Component{
    int size;

    public Storage(String name, String model, int issue, int size) {
        super(name, model, issue);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", issue=" + issue +
                '}';
    }
}
