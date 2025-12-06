public class PhysicalProduct extends Product {
    private String color;
    private double weight;
    private String size;

    public PhysicalProduct() {
        super();
        color = "N/A";
        size = "0x0x0";
    }

    public PhysicalProduct(String color, String size, double weight, String name, double price, String sku) throws IllegalArgumentException {
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







}