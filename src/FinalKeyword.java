package src;
/*
 * Final Keyword can be used at property/method/class
 * Final keyword is used to make something constant which will not change
 * Final keyword used on variable is to restrict any modification to its values and make it a constant
 * Final keyword used on class is to restrict/stop inheritance
 * Final Keyword used on method is to restrict/stop Method Overriding
 */

public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 100;
        // num = 150; // --> Change of value is not allowed to Final variable
        System.out.println(num);
    }
}


final class Car {
    public void brand(){
        System.out.println("Car Brand");
    }
}

// class Hyundai extends Car {
//    // --> Throws compile time error : Final class cannot be Inheritted
// }

class Bike {
    final void brand(){
        System.out.println("Bike Brand");
    }
}

class Yamaha extends Bike {
    // void brand(){
    //     //--> Throws compile time error : Final Method cannot be Overridden
    // }
}