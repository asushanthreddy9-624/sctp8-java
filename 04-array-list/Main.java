import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // eqv. of arrays in JavaScript
        // pros and cons of arraylist vs array
        // CONS
        // 1. it takes more memory
        // 2. it less efficient
        // PROS
        // 1. effectively infinite
        // 2. it does not require memory to be continous
        ArrayList<Integer> numbers  = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(-100);
        // we use .get to retrieve a value from an ArrayList by its index
        System.out.println(numbers.get(1));
    }
}