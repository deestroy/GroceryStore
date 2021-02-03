import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    // Product, Stock
    private HashMap<Integer, Product> products;
    private HashMap<Product, Integer> stocks;

    public Inventory() {
        this.products = new HashMap<Integer, Product>();
        this.stocks = new HashMap<Product, Integer>();
    }

    public String getPName(int id) {
        /*
        Get product name based on id
         */
        Integer temp = id;
        return products.get(temp).getName();
    }

    public double getPPrice(int id) {
        Integer temp = id;
        return products.get(temp).getPrice();
    }

    public int getStock(int id) {
        Integer temp = id;
        return stocks.get(products.get(temp));
    }

    public void addStock(int stock, Product product) {
        stocks.put(product, stock + stocks.get(product));

    }

    public void delStock(int stock, Product product) {

    }

}
