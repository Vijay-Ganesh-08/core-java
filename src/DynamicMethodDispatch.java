package src;
/*
 * DynamicMethodDispatch is used to implement RunTime Polymorphism
 * Which method of which class to be implemented at the RunTime
 * Allows to create a Reference Object of Parent class for Child Class
 * Ex. ParenClass Obj = new ChildClass(); --> Used to access the Child Class Methods
 * Not Allows to create a Reference Object of Child class for Parent Class
 * Ex. ChildClass Obj = new ParenClass(); --> Since Child Class already has visibility of Parent Class
 * 
 */
public class DynamicMethodDispatch {

    public static void main(String[] args) {
        
        test1 obTest = new test1(); //Parent Class Object
        obTest.display();
        
        test2 obTest1 = new test2(); //Child Class Object
        obTest1.display();

        test1 obTest2 = new test2(); //Parent Class Referring to Child Class
        obTest2.display();

        test3 obTest3 = new test3(); //Child Class Object
        obTest3.display();

        test1 obTest4 = new test3(); //Parent Class Referring to Child Class
        obTest4.display();

    }
    
}


class test1{

    public void display(){
        System.out.println("In Test1 Class");;
    }

}

class test2 extends test1{
    public void display(){
        System.out.println("In Test2 Class");;
    }
}

class test3 extends test1{
    public void display(){
        System.out.println("In Test3 Class");;
    }
}