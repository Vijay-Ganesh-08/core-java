package src;
/*
 * FunctionalInterface is implemented to an interface which has only 1 declared method similar to Anonymous Class
 * @FunctionalInterface annotation can be used to notify the compiler and restrict creating more methods
 */

public class FunctionalInterface {
    public static void main(String[] args) {
        Sample obj = new Sample() {
            public void display(){
                System.out.println("Implementing Functional Interface");
            }
        };
        obj.display();
    }
    
}

interface Sample {

    void display();
    
}