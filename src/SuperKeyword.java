package src;
/*
 * Super keywords is default in java which calls the constructor of parent class
 * this() is used to excecute the constructor of the same class and will be useful when the parameterized constructor is in use.
 */
public class SuperKeyword {

    public static void main(String[] args){
       new Dogs();
    }
}

class Animals {
    int age = 5;
    Animals(){
        System.out.println("Animal Default Constructor");
    }
    Animals(String name){
        this();
        System.out.println("Animal Name: "+ name);
    }
    void MakesSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dogs extends Animals{
    Dogs() {
        super("Timmy"); //Calling Parameterized Constructor of parent class
        System.out.println("Dog Default Constructor");
        super.MakesSound();
        System.out.println("Age:" + super.age);

    }
}