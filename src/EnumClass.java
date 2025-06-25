package src;
/*
 * Enum (Enumeration) class is nothing but a class contains named Constants
 * Like class Enum can have constructors, parameterized constructors and properties.
 */

public class EnumClass {
    public static void main(String[] args) 
    {
        //Accessing Single Enum Object
        System.out.println(Status.Running);
        System.out.println(Status.Pending);
        System.out.println(Status.Failed);
        System.out.println(Status.Success);
       
        //Accessing All Enum Objects
        Status[] status = Status.values();
        for (Status s : status){
            System.out.println(s + " : " + s.ordinal());
        }

        //Accessing Single Enum Object
        Laptop laptop = Laptop.MacBook;
        System.out.println(laptop + " : " + laptop.getPrice());

        //Accessing All Enum Objects
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}
enum Status {
    Running, Pending, Failed, Success;
}

enum Laptop{
    MacBook(2000), XPS(2500), Surface(1800), ThinkPad(1400);
    private int price;
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}