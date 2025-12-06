
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product implements CartItemInterface {
    private String name;
    private String sku;
    private double price;

    public Product() {
        name = "N/A";
        sku = "N/A";
    }

    public Product(String name, double price, String sku) throws IllegalArgumentException {
        setName(name);
        setPrice(price);
        setSku(sku);
    }

    public String getName() {
        return name;
    }

    // setName has the potential to cause an IllegalArgumentException error
    public void setName(String name) throws IllegalArgumentException {
        if (name != null && !name.isEmpty()) {
             this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
       
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price >= 0)  {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        
    }

    @Override
    public String toString() {
        return name + ", " + sku + ", $" + price;
    }

    public void edit(Scanner sc) {
        System.out.println("New Product Name: ");
        String newName = sc.nextLine();
        if (!newName.isEmpty()) {
            this.name = newName;
        }

        System.out.println("Enter the new SKU: ");
        String newSku = sc.nextLine();
        if (!newSku.isEmpty()) {
            this.sku = newSku;
        }

        System.out.println("Enter the new price: ");
        String newPrice = sc.nextLine();
        if (!newPrice.isEmpty()) {
            this.price = Double.parseDouble(newPrice);
        }
    }

    @Override
    public void addToCart(ArrayList<CartItemInterface> cart) {
        cart.add(this);
    }
    
    
}