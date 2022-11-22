package computer;

import computer.Computer;

import java.util.Objects;

public class Software extends Computer {
    int ram;
    int memory;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Software software = (Software) o;
        return ram == software.ram && memory == software.memory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, memory);
    }
}
