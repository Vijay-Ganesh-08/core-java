package src;
/*
 * Throws Keyword is used at the method level to indicate the compiler that the method execution could possibly throw a type of exception.
 * The Calling method should catch the type of exceptions which is mentioned after Throws Keyword
 * Throws is majorly used for Checked Exception (IO, SQL Connection etc)
 * Throws is not recommended to implement in MAIN class, it will stop the execution
 */

public class ThrowsKeyword {

    public static void main(String[] args) {
        
        Demo obj = new Demo();
        obj.show();

        try{
            obj.showThrows();
        }
        catch(ClassNotFoundException ex){
            System.out.println("Class not found " + ex);
        }

    }
    
}

class Demo {
    public void show(){
        try{
            Class.forName("Demo");
            System.out.println("Class Found");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
    }

    public void showThrows() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}