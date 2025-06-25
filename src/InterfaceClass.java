package src;
/*
 * Interface is nothing but an abstract class which is full of abstract methods
 * Interface is not a class like abstract, its a type of class itself
 * By Default every method in Interface is public abstarct - meaning any class inherits should implement all the methods inside interface
 * Abstract is implements using extend keyword, interface is done with implements keyword
 * A class can inherit from only 1 abstract class but many interface
 * Like Abstract, interface cannot be instantiated
 * Any Variables created in interface is final and static by default
 * Interface can be inherited using the keyword extends
 */

public class InterfaceClass {
    public static void main(String[] args) {
        ImplementationClass implementationClass1 = new ImplementationClass();
        implementationClass1.display();
        implementationClass1.config();

        System.out.println(InnerInterfaceClass.age);
        System.out.println(InnerInterfaceClass.name);
    }
}

interface InnerInterfaceClass {
    int age = 30;
    String name = "Vijay";
    void display();
    void config();    
}

class ImplementationClass implements InnerInterfaceClass{

    public void display() {
        System.out.println("Implementing Interface Display Method");
    }

    public void config() {
        System.out.println("Implementing Interface Config Method");
    }
}