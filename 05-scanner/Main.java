import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // when we want to create an object in Java, we must use the `new` syntax
        Scanner sc = new Scanner(System.in);

        // There are two ways to ask for Strings in java: next() vs nextLine()
        // next() will accept string input up to a space (it recongise space as a delimiter)
        // nextLine() will accept string input up to \n (the string is terminated by ENTER)
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age:" );
        int age = sc.nextInt();
        sc.nextLine(); // read the \n from the buffer

        // Ask the user for their gender
        // Note: when you do a nextLine() after a nextInt, or a nextDouble
        System.out.println("Enter your gender: ");
        String gender = sc.nextLine();

        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();  // sc.nextDouble() - wait for the user to type in a double
        System.out.println("Enter your height: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        
        System.out.println("You age is " + age);
        System.out.println("BMI =" + bmi);


    }
}