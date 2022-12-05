package order;

import java.util.ArrayList;
import java.util.List;

public final class Bin implements IAddToBin, IShowOrders, IRemoveFromBin{
    //static Order[] orderBin = {};
    List<Order> listOrder = new ArrayList<>();


    // Stores the orders in the orderBin based on their orderNumber.
    @Override
    public void AddToBin(Order order) {
        listOrder.add(order);
    }

    @Override
    public void showOrderList() {
        //int j = listOrder.size();
       // System.out.println(listOrder);
        System.out.println("Order List: ");
        for(int i = 0; i < listOrder.size(); i++){
            System.out.println(listOrder.get(i));

        }

    }

    @Override
    public void RemoveFromBin(Order order) {
        listOrder.remove(order);
    }

    @Override
    public String toString() {
        return "Bin{" +
                "listOrder=" + listOrder +
                '}';
    }
}
