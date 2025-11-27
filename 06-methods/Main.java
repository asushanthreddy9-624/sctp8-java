public class Main {

    /*
    function addTwo(num1, num2) {
     return num1 + num2;
    }
    */

    public static int addTwo(int num1, int num2) {
        return num1 + num2;
    }

    /*
    function getAreaOfCircle(radius) {
      return 22/7 * (radius * radius);
    }
    */

    public static double getAreaOfCircle(double radius) {
        return 3.14 * (radius * radius);
    }

    public static double calculateGSTAmount(double amount, int gstPercentage) {
        // return amount * (gstPercentage/100.0);
        return amount * ((double)gstPercentage)/100.0;
    }

    public static void main(String[] args) {
        double gstAmount = calculateGSTAmount(100, 9);
        System.out.println(gstAmount);

        int sum = addTwo(3, 4);
        System.out.println(sum);
    }
}