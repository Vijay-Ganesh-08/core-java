/*
 * Non-Static members cannot be used in static method
 * its a restriction to avoid confusion with non-static variables based on object since each object will have different values
 * Main is marked as static since its the starting point of program and without static the class will not be loaded and main will not be executed
 */

public class StaticMethod {
    public static void main(String[] args) {

        Mobile oMobile1 = new Mobile();
        oMobile1.brand = "Apple";
        oMobile1.price = 50000;
        Mobile.name = "iPhone 13";

        Mobile oMobile2 = new Mobile();
        oMobile2.brand = "Samsung";
        oMobile2.price = 35000;
        Mobile.name = "Smart Phone"; //Static Variable

        //Calling Non-Static Method
        oMobile1.print();
        oMobile2.print();

        //Calling Static Method
        Mobile.print1(oMobile1);
        Mobile.print1(oMobile2);
        
    }
    
}

class Mobile{
    String brand;
    int price;
    static String name;

    void print(){
        System.out.println(brand + " " + price + " " + name);
    }

    static void print1(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}