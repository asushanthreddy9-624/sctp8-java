
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // An abstract class cannot have an object created from it
        // Shape s = new Shape();

        Rectangle r = new Rectangle("rect01", "red", 0,0, 5,5);
        System.out.println(r);

        Circle c = new Circle("circle01", "green", 10, 7, -7);
        System.out.println(c);

        // Polymorphism
        // A reference to a parent class can be used to store
        // an object of the child class
        Shape shape1 = new Rectangle("rect03", "blue", 3,3, 6, 6);
        Shape shape2 = new Circle("circle4", "azure", 15, 1, 1);

        System.out.println(shape1);
        System.out.println(shape2);

        Shape shape3 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for circle, and R for rectangle");
        String newShapeString = sc.next();
        if (newShapeString.equals("C")) {
            shape3 = new Circle("new circle", "pink", 100, 50, 50);
        } else if (newShapeString.equals("R")) {
            shape3 = new Rectangle("new rectangle", "pink", 4,4,6,6);
        }

        // in the line below, Java at the time of compliation, does not know
        // the exact Shape class in it (so it could be an instance of Shape class,
        // or it could be an instance of a child class)
        System.out.println(shape3);

        ArrayList<Shape> canvas = new ArrayList<>();
        canvas.add(c);
        canvas.add(r);
        canvas.add(shape1);
        canvas.add(shape2);
        canvas.add(shape3);

        for(Shape s : canvas) {
            System.out.println(s);
        }

        // how can we put to put Text objects and Shapes
        // objects in the same arraylist. How?
        ArrayList<HasPosition> drawableThings = new ArrayList<>();
        drawableThings.add(new Text("The quick brown fox", 1,1));
        drawableThings.add(r);
        drawableThings.add(c);

        for (HasPosition d : drawableThings) {
            System.out.println(d.getX() + ", " + d.getY());
        }
 

    }
}