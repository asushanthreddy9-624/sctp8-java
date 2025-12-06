import java.util.ArrayList;

public class Membership implements CartItemInterface{
    private String type;
    private double cost;

    public Membership() {
    }

    public Membership(double cost, String type) {
        this.cost = cost;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return getType();
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void addToCart(ArrayList<CartItemInterface> cart) {
        cart.add(this);
    }
    


}
