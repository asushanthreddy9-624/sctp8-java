public class Circle extends Shape {
    private double radius;
    private int x;
    private int y;

    public Circle() {
        super();
    }

    public Circle(String name, String color, double radius, int x, int y) {
        super(name, color);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "circle, name: " + name +
        "color: " + color +
        "radius: " + radius +
        "position" + x + "," + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}