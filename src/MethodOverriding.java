package src;
/*
 * MethodOverriding is concert of overriding the implementation of a same method 
 * which is available in both Parent and Child Class
 */

public class MethodOverriding {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.show();
        childClass.config();
    }
}


class ParentClass {

    public void show(){
        System.out.println("In Parent Class - Show");
    }

    public void config(){
        System.out.println("In Parent Class - Config");
    }
}

class ChildClass extends ParentClass {

    public void show(){
        System.out.println("In Child Class - Show");
    }
}