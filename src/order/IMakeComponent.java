package order;

import components.Component;
import components.Cpu;
import components.Keyboard;

public interface IMakeComponent {
    default Component MakeComponent(Component component){
        if (component.getName() == "Cpu"){
            Cpu cpu = new Cpu(component.getName(), component.getModel(), component.getIssue(), 4);
            return cpu;
        } else if (component.getName() == "Keyboard") {
            Keyboard keyboard = new Keyboard(component.getName(), component.getModel(), component.getIssue(), "Red");
            return keyboard;

        }else 
        return null;
    }
}
