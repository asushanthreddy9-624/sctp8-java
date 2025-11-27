import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // for loop just like your for loop in JavaScript
        /*
        for (let i = 0; i < 10; i++) {
            console.log(i);
        }
        */

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // use dynamic variable inference
        for (var j = 0; j < 10; j ++ ) {
            System.out.print(j);
        }

        ArrayList<String> names = new ArrayList<String>();
        names.add("Alan");
        names.add("Tony");
        names.add("Paul");

        // Old, traditional syntax
        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }

        // very smiliar to your JS for (let name of names) { }
        for (String name : names) {
            System.out.println(name);
        }   
    }
}