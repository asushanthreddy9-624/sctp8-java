// For a public class, the name of the Class
// must match the file name
// A class holds the definition of an object
// Every object creates from the class will have the 'keys' and 'methods'
// defined in the class.
public class Car {
    // attributes, or properties
    // private means that only code in the class
    // can access
    // maxSpeed must be at least 1
    private double maxSpeed;
    // for colors, only red, green, blue, white and black are supported
    private String color;

    // in Java, a setter is a method which only purpose is to set the value of an
    // attribute
    public void setMaxSpeed(double newMaxSpeed) {
        if (newMaxSpeed > 0) {
            maxSpeed = newMaxSpeed;
        }
    }

    public void setColor(String color) {
        if (color.equals("red") ||
                color.equals("blue") ||
                color.equals("green") ||
                color.equals("white") ||
                color.equals("black")) {
            this.color = color;
        }
    }

    // GETTER: Is to return the value of a private attribute
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    // a function in a class known as a "method"
    public boolean canGoUpTo(double speed) {
        if (speed <= maxSpeed) {
            return true;
        }
        return false;
    }
}