package src;
/*
 * Up and DownCasting is possible with the Objects to the class which is inherited
 * UpCasting Creating a Object of type SuperClass and referencing to ChildClass
 * DownCasting Creating a Object of type ChildClass and referencing to ParentClass
 */
public class UpAndDownCasting {
    public static void main(String[] args) {
        //UpCasting Creating a reference Object of SuperClass for ChildClassObject
        Sample1 obj = (Sample1) new Sample2();
        obj.display1();

        Sample1 obj1 = new Sample2();
        obj1.display1();

        //DownCasting 
        Sample2 obj2 = (Sample2) obj;
        obj2.display2();

        Sample2 obj3 = (Sample2) obj1;
        obj3.display2();
        
    }
}


class Sample1{

    void display1(){
        System.out.println("Class Sample 1");
    }
}

class Sample2 extends Sample1 {
    void display2(){
        System.out.println("Class Sample 2");
    }
}