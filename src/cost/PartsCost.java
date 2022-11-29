package cost;

public final class PartsCost implements ICalculateCost {
    final static int keyboardCost = 30;
    final static int mouseCost= 25;
    final static int motherboardCost = 150;
    final static int cpuCost = 200;




    public int repairPartCost(String brokenPart) {
             if(brokenPart == "keyboard"){
                 return keyboardCost;
             } else if (brokenPart == "mouse") {
                 return mouseCost;

             } else if (brokenPart == "motherboard") {
                 return motherboardCost;

             } else if(brokenPart == "cpu") {
                 return cpuCost;

             }

        return 0;
    }

}

