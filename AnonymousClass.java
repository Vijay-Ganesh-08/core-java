/*
 * Anonymous class is to change the implementation of class for only once.
 * This is done at the time of Object instantiating and it will execute the newer implementation.
 */
public class AnonymousClass {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous(){
            public void display()
            {
                System.out.println("In Anonymous Inner Class");
            }
        };
        anonymous.display();
    }
}

class Anonymous {
    public void display(){
        System.out.println("In Anonymous Class");
    }
}