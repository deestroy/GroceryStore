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
        return products.get(id).getName();
    }
    public void newProduct(String name, int id, double price, int stock) {
        Product item = new Product(name, id, price);
        products.put(id, item);
        stocks.put(item, stock);
    }

    public double getPPrice(int id) {
        return products.get(id).getPrice();
    }

    public int getStock(int id) {
        if(checkProduct(id)) {
            return stocks.get(products.get(id));
        }
        return -1;
    }

    public void addStock(int id, int stock) {
        if(checkProduct(id)) {
            stocks.put(products.get(id), stock + stocks.get(products.get(id)));
        }
        System.out.println("Product does not exist.");

    }

    public boolean delStock(int id, int stock) {
        if(stocks.get(products.get(id)) - stock < 0) {
            return false;
        }
        else {
            stocks.put(products.get(id), stocks.get(products.get(id)) - stock);
            return true;
        }
    }

    private boolean checkProduct(int id) {
        if(stocks.get(products.get(id)) == null) {
            return false;
        }
        return true;
    }

}
