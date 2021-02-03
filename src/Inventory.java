import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    // Product, Stock
    private HashMap<Integer, Product> idproducts;
    private HashMap<Product, Integer> amount;

    public Inventory() {
        this.idproducts = new HashMap<Integer, Product>();
        this.amount = new HashMap<Product, Integer>();
    }

    public String getPName(int id) {
        /*
        Get product name based on id
         */
        Integer temp = id;
        return idproducts.get(temp).getName();
    }

    public double getPPrice(int id) {
        Integer temp = id;
        return idproducts.get(temp).getPrice();
    }

    public int getStock(int id) {
        return 0;
    }

    public void addStock(int stock, Product product) {
        int id = product.getId();

       // products.put(product, stock);

    }

    public void delStock(int stock, Product product) {

    }

}
