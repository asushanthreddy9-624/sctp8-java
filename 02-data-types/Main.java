public class Main {
    public static void main(String[] args) {
        // In Java, we must define the data type of the variable
        // when creating the variable (i.e strongly typed language)

        int secretOfLife = 42;
        final int GST = 9;

        System.out.println("secretOfLife = " + secretOfLife);

        // Representing real numbers
        double price = 3.99; // double precision uses 64 bits to store the data
        float radius = 3.30f;  // the f at the back represent floating point, only use 32 bits to store the data

        // larger precision data type can store values of less precise data type    
        double a = 3.5f; // okay!

        // We can only use double quotes to define Strings in Java
        String rhyme = "The quick brown fox jumps over the lazy dog";

        // Single quote is used for a data type 'char'
        char c = 'a';

        boolean wantPlasticBag = true;

    }
}