/*
 * Class inside a class is called InnerClass or Nested Class
 * Inner class can be instatiated with OuterClass Object and Reference
 * static keyword can be used only in the inner class and not for outer class
 */

public class InnerClass {
    public static void main(String[] args) {
        OuterClass obClass = new OuterClass();
        obClass.name = "Vijay";
        obClass.age = 30;
        obClass.display();

        OuterClass.InnerInnerClass oInnerClass = obClass.new InnerInnerClass();
        oInnerClass.display();

    }
}


class OuterClass {
    String name;
    int age;

    public void display(){
        System.out.println("Name : " + name + ", Age : " + age);
    }

    public class InnerInnerClass {
    
        public void display(){
            System.out.println("Inside Inner Class");
        }
    }
}