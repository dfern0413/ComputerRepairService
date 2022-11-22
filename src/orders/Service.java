package orders;

public class Service extends Orders {
    String problemDescription;

    @Override
    public String toString() {
        return "Service{" +
                "problemDescription='" + problemDescription + '\'' +
                '}';
    }
}
