import java.util.ArrayList;
import java.util.Scanner;

public class StoreManager{
    ArrayList<int[]> cart;
    Inventory inventory;

    public StoreManager() {
        this.inventory = new Inventory();
        this.cart = new ArrayList<>();
    }

    public void productList(int productID, int quantity) {
        int[] item = {productID, quantity};
        cart.add(item);
    }

    public void printCart() {
        for(int i = 0; i < cart.size(); i++) {
            for(int j = 0; j < cart.get(i).length; j++)
                System.out.print(cart.get(i)[j] + " ");
        }
        System.out.println();
    }

    public int transaction() {
        int total = 0;

        for(int i = 0; i < cart.size(); i++) {
            for(int j = 0; j < cart.get(i).length; j++)

        }
        System.out.println();

    }







}


