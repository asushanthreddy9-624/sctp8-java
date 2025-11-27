import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        // the correct way to compare string is to use .equals() method
        if (password.equals("rotiprata123")) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}