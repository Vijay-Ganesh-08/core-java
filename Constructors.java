/*
 * Constructors are used to initialize the instance variables
 * By Default when a Object is created the class Constructor is called to initialize the variables
 * Constructors name should same as Class name
 * Constructors can be parameterized and its Constructor Overloading
 */
public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " " + obj.getAge());

        obj.setAge(10);
        obj.setName("Vijay");

        System.out.println(obj.getName() + " " + obj.getAge());

        Human obj1 = new Human(20,"Jonny");
        System.out.println(obj1.getName() + " " + obj1.getAge());
    }
    
}

class Human {

    private int age;
    private String name;

    Human() {
        this.age = 15;
        this.name = "Nothing";
    }

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}