package src;
/*
 * Every time when printing an Object it calls .toString() by default.
 * Printing an Object results ClassName@HexaDecimalHashCode of the Object where its stored in Heap Memory
 * toString() , equals() and much more Object class methods can be overwritten in a class to play with Objects
 */
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "MacBook Pro";
        obj1.price = 200000;

        Laptop obj2 = new Laptop();
        obj2.model = "MacBook Pro";
        obj2.price = 200000;

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        boolean result = obj1 == obj2;
        boolean result1 = obj1.equals(obj2);

        System.out.println(result);
        System.out.println(result1);

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}


class Laptop {

    String model;
    int price;

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public boolean equals(Laptop object){
        if (this.model.equals(object.model) && this.price == object.price)
            return true;
        else 
            return false;
    }
}