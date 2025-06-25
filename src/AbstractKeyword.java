package src;
/*
 * Abstract keyword is used to declare a method/class which should be implemented by Sub/Child Class
 * Abstract class can contain Abstract and Non-Abstract methods and there's no compuslion to have only abstract methods
 * Abstract methods can be defined only inside Abstract Class
 * Objects cannot be created for an Abstract class
 * All abstract methods should implemented by the Sub/Child class.
 */

public class AbstractKeyword {

    public static void main(String[] args) {
        TataNexon tataNexon = new TataNexon();
        tataNexon.drive();
        tataNexon.playMusic();
    }
    
}

abstract class Car {
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}

class TataNexon extends Car {

    public void drive(){
        System.out.println("Driving Tata Nexon");
    }
}