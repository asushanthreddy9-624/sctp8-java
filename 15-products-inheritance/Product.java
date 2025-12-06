public class Product {
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

    public String toString() {
        return name + ", " + sku + ", $" + price;
    }



    
    
}