/*
 * Ternary Operator is used to simplify if..else statement into a Single line
 * Syntax result = (Condition) ? true : false
 */

public class TernaryOperator {

    public static void main(String[] args) {

        int num = 10;
        int result = 0;

        // if(num%2==0){
        //     result = 10;
        // } else {
        //     result = 20;
        // }

        result = (num%2==0) ? 10:20;
        System.out.println(result);
    }
    
}
