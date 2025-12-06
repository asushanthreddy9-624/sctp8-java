public class Rectangle extends Shape {
    private int topLeftX = 0;
    private int topLeftY = 0;
    private int bottomRightX = 0;
    private int bottomRightY = 0;

    public Rectangle() {
        // Call the parent's class Constructor
        super();
    }

    public Rectangle(String name, String color, int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        super(name, color);
        this.bottomRightX = bottomRightX;
        this.bottomRightY = bottomRightY;
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
    }

    // Whenever we try convert an object to a string
    // Java will automatically call the toString function
    public String toString() {
        return "rectangle, name: " + name 
        + ", color: " + color
        + " position:"
        + topLeftX +","+ topLeftY
        + bottomRightX + "," + bottomRightY;
    }

    public int getX() {
        return topLeftX;
    }
    public int getY() {
        return topLeftY;
    }

}