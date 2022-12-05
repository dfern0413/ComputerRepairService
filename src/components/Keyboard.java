package components;

public class Keyboard extends Component{
    String ledColor;

    public Keyboard(String name, String model, int issue, String ledColor) {
        super(name, model, issue);
        this.ledColor = ledColor;
    }
}
