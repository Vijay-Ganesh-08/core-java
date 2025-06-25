package src;
/*
 * Static properties are shared to the entire class
 * Static variables to be called via class (ClassName.StaticVariable)
 * Static variables can be used in Non-Static Method
 */
public class StaticKeyWord {

    public static void main(String[] args) {

        Mobile oMobile1 = new Mobile();
        oMobile1.brand = "Apple";
        oMobile1.price = 50000;
        Mobile.name = "iPhone 13";
        oMobile1.print();

        Mobile oMobile2 = new Mobile();
        oMobile2.brand = "Samsung";
        oMobile2.price = 35000;
        Mobile.name = "Smart Phone"; //Static Variable

        oMobile1.print();
        oMobile2.print();
        
    }
    
}

class Mobile{
    String brand;
    int price;
    static String name;

    void print(){
        System.out.println(brand + " " + price + " " + name);
    }
}