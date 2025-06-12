/*
 * Class is a bunch of properties and behaviours.
 * Object is an instance of object to access the properties and behaviours of a class.
 */

public class ClassAndObject {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        calc obj = new calc(); // Creating a Object for class calc
        int result = obj.add(a, b); // Using the method add from calc through object
        System.out.println(result);
    }
}

/*
 * Class called calc which has a method to add 2 numbers.
 */
class calc {

    int add(int a, int b) {
        return a+b;
    }
}