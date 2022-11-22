package computer;

import computer.Computer;

import java.util.Objects;

public class Hardware extends Computer {

    String motherboardSize;
    String desktop;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hardware hardware = (Hardware) o;
        return Objects.equals(motherboardSize, hardware.motherboardSize) && Objects.equals(desktop, hardware.desktop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motherboardSize, desktop);
    }
}
