public class Main {
    public static void main(String[] args) {
        // define a variable which data type
        // is the same our class
        // c is a variable that can store a reference to the car object
        Car c = new Car();
        // c.maxSpeed = 100;
        c.setMaxSpeed(100.0);
        c.setColor("red");
        System.out.println(c.getMaxSpeed());
        System.out.println(c.getColor());
        

        Car c2 = new Car();
        c2.setMaxSpeed(200.0);
        c2.setColor("red");
        System.out.println(c2.getMaxSpeed());
        System.out.println(c2.getColor());
        System.out.println(c2.canGoUpTo(100));

        System.out.println(c.canGoUpTo(200));
    }
}