package src;
/*
 * Primitive - Int/Float/Char/Boolean - value itself is stored in stack
 * Int - byte/short/int/long - Long comes with suffix l at the value (ex: long l1 = 12345l)
 * Float - Float/Double (decimal values) float comes with suffix f at the value (ex: float f1 = 123.45f)
 * Non-Primitive - String/Arrays/Object/Class - value is stored in heap and its reference is stored in stack
 */

public class DataTypes {
    public static void main(String[] args) {
        
        byte b1 = 19;
        int num = 1234567;
        short s1 = 30000;
        long l1 = 12345678901234556l;

        float f = 5.8f;
        double d = 5.8;

        boolean bool1 = true;
        char c1 = 'A';

        System.out.println("Byte : " + b1);
        System.out.println("Int : " + num);
        System.out.println("Short : " + s1);
        System.out.println("Long : " + l1);
        System.out.println("Double : " + d);
        System.out.println("Float : " + f);
        System.out.println("Boolean : " + bool1);
        System.out.println("Char : " + c1);
        

        //Literals
        int num1 = 0b101; //Byte code for value 5
        int num2 = 0x7E; //Hexadecimal code for 126
        int num3 = 1_00_00_00_000; // Underscore used in Java to differeniate the counts of Zeros, result will omit the Underscores

        System.out.println("Byte Code in Int : " + num1);
        System.out.println("Hexadecimal Code in Int : " + num2);
        System.out.println("Underscore usage in Int : " + num3);

        c1++; //Since c1 is already set to A earlier in this file
        System.out.println("Character Incremental : " + c1);


    }
}
