package cost;

import components.Component;
import components.Keyboard;

import java.util.ArrayList;

public final class PartsCost implements ICalculateCost {
    final static int keyboardCost = 30;
    final static int storageCost= 25;
    final static int motherboardCost = 150;
    final static int cpuCost = 200;
    final static int ramCost = 250;




    public int repairPartCost(ArrayList<Component> componentList) {
        int totalCost = 0;

//        for(int i = 0; i < componentList.size(); i++){
//                if(componentList.get(i) == Component.Keyboard){
//                     totalCost+= keyboardCost;
//                 } else if (componentList.get(i) == Component.Storage) {
//                    totalCost+= storageCost;
//
//                 } else if (componentList.get(i) == Component.Motherboard) {
//                     totalCost+= motherboardCost;
//
//                 } else if(componentList.get(i) == Component.Cpu) {
//                     totalCost+=cpuCost;
//
//                 } else if (componentList.get(i) == Component.Ram) {
//                    totalCost+=ramCost;
//                }

            return totalCost;
    }

}

