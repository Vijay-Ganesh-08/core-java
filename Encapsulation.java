/*
 * Encapsulation is nothing but to capusle the resoures of programs
 * Applied to class members or methods to restrict the usage from outside
 * Private is applied to variables to restrict the direct usage 
 * Private variable can be accessed only through Methods.
 */

public class Encapsulation {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("Vijay");

        System.out.println(obj.getName() + " " + obj.getAge());
    }
    
}

class Human {

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

}
