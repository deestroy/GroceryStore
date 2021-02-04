import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        StoreManager store = new StoreManager(inv);


        inv.newProduct("candy",1010,80, 10 );
        inv.newProduct("candy",1020,60, 8 );
        inv.newProduct("candy",1030,70, 7 );

        store.productList(1010, 2);
        store.productList(1020, 2);
        store.productList(1030, 2);

        store.printCart();
        System.out.println("Total: " + store.transaction());


    }

}
