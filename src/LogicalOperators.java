package src;
/*
 * Logical Operators are used to compare multiple variables/conditions
 * Output of LogicalOperators is Boolean (true/false)
 * && (Logical AND), || (Logical OR), ! (Logical NOT)
 * && - Returns True only if All Conditions Results TRUE else FALSE
 * || - Returns Trus if any one of the Conditions Results TRUE else FALSE
 * ! - Returns the reversed result (TRUE to FALSE or FALSE to TRUE)
 */

public class LogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int x = 5;
        int y = 3;

        System.out.println(a<b && x<y);
        System.out.println(a<b || x<y);
        System.out.println(!(x<y));
        System.out.println(!(x<y) || !(a>b));
        System.out.println(!(x<y) && !(a>b));
    }
    
}
