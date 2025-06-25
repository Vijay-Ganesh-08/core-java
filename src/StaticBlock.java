package src;
/*
 * Static Block can be used to initialise the static members of a class
 * When a object is created the class gets loaded and then the class members are instatiated
 * Static Block will be executed once at the time of class getting loaded
 * Constructor will be executed everytime an object is created for that class
 * Unless the Object is created, it will not load the class or instantiate the members of the class
 * Class.forName(<<ClassName>>) can be used to load the class to execute the static block of the class
 */
public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Mobile oMobile1 = new Mobile();
        oMobile1.brand = "Apple";
        oMobile1.price = 50000;
        oMobile1.print();

        Mobile oMobile2 = new Mobile();
        oMobile2.brand = "Samsung";
        oMobile2.price = 35000;
        oMobile2.print();
        
        Class.forName("Demo"); //This will not create an Object but loads the class
    }
    
}

class Mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "Smart Phone";
        System.out.println("In Mobile Static Block");
    }

    Mobile(){
        System.out.println("In Mobile Constructor");
        brand = "";
        price = 200;
    }

    void print(){
        System.out.println(brand + " " + price + " " + name);
    }
}

class Demo{
    static
    {
        System.out.println("In Demo Static Block");
    }
}