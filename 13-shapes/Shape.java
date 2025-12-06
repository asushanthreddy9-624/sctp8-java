public abstract class Shape implements HasPosition {
    protected String name; 
    protected String color;

    public Shape() {
        name = "Untitled";
        color = "white";
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}