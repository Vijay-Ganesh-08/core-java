/*
 * Casting - Explicit Conversion (Ex: Int to Short/Byte)
 * Convertion - Implicit Conversion (Ex : Short to Int/Long)
 * Type Promotion - Promoting the type to bigger range when it exceeds
 */

public class TypeCasting {
 
    public static void main(String[] args) {
        
        byte b1 = 125;
        int i1 = b1; //Implicit Conversion
        byte b2 = (byte) i1; //Explicit Conversion
        // byte b3 = i1; // --> Throws compile time error 

        float f1 = 5.6f;
        int i2 = (int)f1; //Explicit Conversion
        // int i3 = f1; // --> Throws compile time error 
        
        System.out.println("Byte 1 : " + b1);
        System.out.println("Int 1 : " + i1);
        System.out.println("Byte 2 : " + b2);
        System.out.println("Float 1 : " + f1);
        System.out.println("Int 2 : " + i2);

        //Type Promotion
        byte b4 = 10;
        byte b5 = 30;
        // byte result = b4*b5; // --> Throws compile time error 
        int result = b4*b5;
        System.out.println(result);

    }
}
