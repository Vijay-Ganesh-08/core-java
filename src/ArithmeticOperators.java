package src;
/*
 * Operators which are used to assign values to an Variable and Manipulation
 * Incremental and Decremental operators are specific to single variables
 * Arithmetic Operators are used to process the data and perform Arithmetic Operations
 */

public class ArithmeticOperators {
    
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2; //Returns Quotient
        int mod = num1 % num2; //Returns Remainder

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        
        //Incremental
        num1 = num1 + 2;
        System.out.println(num1);
        num1 += 2;
        System.out.println(num1);
        num1++; //Post Increment
        System.out.println(num1);
        ++num1; //Pre Increment
        System.out.println(num1);

        int num3 = 5;
        int result = num3++; // Assigns the current value and increments
        System.out.println("Result 1 = " + result);

        result = ++num3; // Increments the current value and assigns
        System.out.println("Result 2 = " + result);

        //Self Multiplication
        num1 *= 2;
        System.out.println(num1);

        //Decremental
        num1--;
        System.out.println(num1);

    }
}
