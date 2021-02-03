import java.util.ArrayList;
import java.util.Scanner;

public class StoreManager{
    ArrayList<int[]> cart = new ArrayList<>();
    Inventory inventory = new Inventory();

    public StoreManager() {

    }

    public int total(int[][] cart) {
        return 0;
    }

    public int amountStock(int productID) {
        return 0;
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

    public void setCart(ArrayList<int[]> cart) {
        this.cart = cart;
        for(int i = 0; i < this.cart.size(); i++) {
            inventory.newProduct(this.cart.get(i));
        }
    }

    public static void main(String[] args) {
        StoreManager store = new StoreManager();
        String exit = "n";
        int productID;
        int quantity;
        while(exit.equals("n")) {
            Scanner p = new Scanner(System.in);
            System.out.println("Input a productID:");
            productID = p.nextInt();
            System.out.println("Output: " + productID);

            Scanner q = new Scanner(System.in);
            System.out.println("Input a quantity:");
            quantity = q.nextInt();
            System.out.println("Output: " + quantity);

            store.productList(productID, quantity);

            Scanner ex = new Scanner(System.in);
            System.out.println("Do you want to exit:");
            exit = ex.nextLine();

        }
        store.printCart();


    }
}
