package src;
/*
 * This Keyword is used to differentiate the Instance and Local variable
 * This KeyWord refers to the Instance variables of the current Object
 */
public class ThisKeyWord {
    
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

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}
