/*
 * Anonymous class is to change the implementation of class for only once.
 * This is done at the time of Object instantiating and it will execute the newer implementation.
 * Its is possbile to implement this type in Abstract class
 */

public class AnonymousAbstractClass {
    public static void main(String[] args) {
        AbstarctClass abstarctClass = new AbstarctClass() {
            public void display(){
                System.out.println("Inside Anonymous Inner Abstract Class");
            }
        };
        abstarctClass.display();
    }
}

abstract class AbstarctClass{
    public abstract void display();
}