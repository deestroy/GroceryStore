import java.util.Scanner;

public class Main {
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
