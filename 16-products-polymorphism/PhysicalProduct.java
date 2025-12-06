
import java.util.Scanner;

public class PhysicalProduct extends Product {
    private String color;
    private double weight;
    private String size;

    public PhysicalProduct() {
        super();
        color = "N/A";
        size = "0x0x0";
    }

    public PhysicalProduct(String color, String size, double weight,
         String name, double price, String sku) throws IllegalArgumentException {
        super(name, price, sku);
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // method overriding
    // the child class has the same method as the parent
    // if polymorphism happens, Java will use the child class method instead
    @Override
    public String toString() {
        return super.toString() +  " size: " + size +
          " color: " + color +
          " weight " + weight;
    }

    @Override
    public void edit(Scanner sc) {
        super.edit(sc);

        System.out.println("Enter the new size");
        String newSize = sc.nextLine();
        if (!newSize.isEmpty()) {
            this.size = newSize;
        }

        System.out.println("Enter new color:");
        String newColor = sc.nextLine();
        if (!newColor.isEmpty()) {
            this.color = newColor;
        }


        System.out.println("Enter the new weight:");
        String newWeight = sc.nextLine();
        if (!newWeight.isEmpty()) {
            this.weight = Double.parseDouble(newWeight);
        }
    }





}