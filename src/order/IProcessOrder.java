package order;

import components.Cpu;

public interface IProcessOrder {
    default String processOrder(Order order) {
        if (order.component.getName() == "Cpu") {
            return "Cpu";
        } else {
            return null;
        }
    }
}
