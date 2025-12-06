import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner sc;
    private static ArrayList<Product> productList = new ArrayList<>();
    private static ArrayList<CartItemInterface> cart = new ArrayList<>(); 
    public static void main(String[] args) {

        productList.add(new PhysicalProduct(
            "blue",
            "2x2x2",
            10,
            "Blue Pencil Case",
            5.50,
            "CASE-01"
        ));

        productList.add(new DigitalProduct("mp4", 
            "lotr-extended.mp4",
            "Lord of the Rings Extended edition",
            109.90,
            "LOTR-EX"
        ));

        sc = new Scanner(System.in);
        while (true) {
            int choice = displayMenu();
            if (choice == 1) {
                addNewProduct();
            }
            if (choice == 2) {
                displayProducts();
            }
            if (choice==3) {
                editProduct();
            }
            if (choice==4) {
                deleteProduct();
            }
            if (choice==5) {
                addToCart();
            }
            // choice 5 is quit
            if (choice == 6) {
                break;
            }
        }

    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Add To Cart");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear the input buffer
            if (choice >= 1 && choice <= 6) {
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
        System.out.println("-------------------------");
        for (int i = 0; i < productList.size(); ++i) {
            Product p = productList.get(i);
         
            // print will not push the cursor to the next line
            System.out.print(i+". ");
            // When we print out an object, it's toString method is called automatically
            System.out.println(p);
        }
        System.out.println();
    }

    private static void editProduct() {
        // display all the products
        displayProducts();

        System.out.println("Select the product to edit");
        // the user will select one to edit
        int productIndexToEdit = sc.nextInt();
        sc.nextLine();
        // we display the edit portion for the product
        Product productToEdit = productList.get(productIndexToEdit);

        productToEdit.edit(sc);

        
    }

    private static void deleteProduct() {
        System.out.println("Delete products");
        displayProducts();
        System.out.println("Enter the index of the product to delete:");
        int productToDeleteIndex = sc.nextInt();
        sc.nextLine();

        // ensure that the index the user types in is within limits
        if (productToDeleteIndex >=0 && productToDeleteIndex < productList.size()) {
            productList.remove(productToDeleteIndex);
        }
    }

    private static void addToCart() {
        System.out.println("Add to Cart");

        displayProducts();
        System.out.println("Enter M to buy a membership");

        String userChoice = sc.nextLine();
        if (userChoice.toLowerCase().equals("m")) {
            Membership m = new Membership(100, "VIP");
            m.addToCart(cart);
        } else {
            int index = Integer.parseInt(userChoice);
            Product p = productList.get(index);
            p.addToCart(cart);

        }

        for (CartItemInterface c : cart) {
            System.out.println(c.getName());
        }
    }
}