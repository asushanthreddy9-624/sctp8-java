import java.util.ArrayList;
// Interface also consists of public methods and NO implementation
// the methods are to be written in any classes that implement it
public interface CartItemInterface {
    // all classes that implement the CartItemInterface MUST have its
    // own version of the method below.
    void addToCart(ArrayList<CartItemInterface> cart);
    String getName();
}
