import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner sc;
    private static ArrayList<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (true) {
            int choice = displayMenu();
            if (choice == 1) {
                addNewProduct();
            }
            if (choice == 2) {
                displayProducts();
            }
            // choice 3 is quit
            if (choice == 3) {
                break;
            }
        }

    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear the input buffer
            if (choice >= 1 && choice <= 3) {
                break;
            }
        }

        return choice;

    }

    private static void addNewProduct() {
        System.out.println();
        System.out.println("Adding New Product");
        System.out.println("Enter the name of the product");
        String productName = sc.nextLine();
        System.out.println("Enter the price of the product");
        double price = sc.nextDouble();
        sc.nextLine(); // clear the buffer
        System.out.println("Enter the SKU of the product");
        String sku = sc.nextLine();

        Product newProduct = null; // create a placeholder variable to stoe a rpoduct

        // ask the user if they are adding a digital product or a physical product
        System.out.println("Enter 1 for a physical product, enter 2 for a digital product");
        int productType = sc.nextInt();
        sc.nextLine();

        if (productType==1) {
            // Create a Physical Product
            System.out.println("Enter the color of the product");
            String color = sc.nextLine();

            System.out.println("Enter the weight of the product");
            double weight = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter the dimension of the product");
            String size = sc.nextLine();
            newProduct = new PhysicalProduct(color, size, weight, productName, price, sku);

        }
        if (productType == 2) {
            System.out.println("Enter the file format");
            String fileFormat = sc.nextLine();

            System.out.println("Enter the filename");
            String fileName = sc.nextLine();

            newProduct = new DigitalProduct(fileFormat, fileName, productName, price, sku );
        }


        productList.add(newProduct);
    }

    private static void displayProducts() {
        System.out.println("Display All Products");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
}