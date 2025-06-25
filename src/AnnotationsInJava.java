package src;
/*
 * Extra Information provided to the compiler to perform the action effectively. 
 * Annotations helps to identify any bug or error at the compile time itself
 */
public class AnnotationsInJava {
    public static void main(String[] args) {
        Child child = new Child();
        child.getFirstName();
    }
}

class Parent{
    public void getFirstName(){
        System.out.println("Parent Class");
    }
}

class Child extends Parent{
    
    @Override
    public void getFirstName(){
        System.out.println("Child Class");
    }
}