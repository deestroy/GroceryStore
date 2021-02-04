import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreManager{
    //ArrayList<int[]> cart;
    HashMap <Integer, Integer> cart;
    Inventory inventory;

    public StoreManager() {
        this.inventory = new Inventory();
        this.cart = new HashMap<Integer, Integer>();
    }

    public void productList(int productID, int quantity) {
        cart.put(productID, quantity);
    }

    public double transaction() {
        double total = 0;
        for(int i : cart.keySet()) {
            if(inventory.delStock(i, cart.get(i)) == true) {
                total += cart.get(i) * inventory.getPPrice(i);
                inventory.delStock(i, cart.get(i));
            }
        }
        return total;
    }







}


