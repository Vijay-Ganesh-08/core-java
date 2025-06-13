/*
 * Object which is created and assigned to an object of class is Reference Object
 * Object which is creeated only with new keyword to class is Anonymous Object
 * Anonymous Object instatiates the class in Heap memory but has nothing in Stack and you cannot reuse.
 * Reference Object instantiates the class in Heap and a reference object is created in Stack but can be reused.
 */
public class AnonymousObject {

    public static void main(String[] args) {
            A obj = new A(); //Referenced Object
            obj.show();

            new A(); //Anonymous Object
            
            new A().show();
    }

}

class A{

    A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("In A Show");
    }
}
