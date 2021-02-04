import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreManager{
    HashMap <Integer, Integer> cart;
    private Inventory inventory;

    public StoreManager(Inventory inv) {
        inv = new Inventory();
        this.cart = new HashMap<Integer, Integer>();
    }

    public void productList(int productID, int quantity) {
        cart.put(productID, quantity);

    }

    public double transaction() {
        double total = 0;
        for (int i : cart.keySet()) {
            if (inventory.delStock(i, cart.get(i))) {
                total += (cart.get(i) * inventory.getPPrice(i));
                inventory.delStock(i, cart.get(i));
            } else {
                System.out.println(i + " is not available");
            }
        }
        return total;
    }


    public void printCart() {
        for (int i : cart.keySet()) {
            System.out.println(i +", " + cart.get(i));
        }

    }

}


