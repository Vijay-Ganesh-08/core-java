package src;
/*
 * Lambda Expression is introduced in Java 8
 * Lambda Expression can be implemented only with Functional Interface (which has only 1 method)
 * Lambda expression is simplified version of Functional Interface
 * Curly Braces is used to implement multiple Lines
 * Single line implementation can be done at the object initialisation itself
 */

public class LambdaExpression {
    public static void main(String[] args) {
        
        //Multiple line Implementation
        Sample obSample = () -> {
            System.out.println("Using Lambda Expression");
            System.out.println("Printing Multiple Lines");
        };
        obSample.display();
        //Single line Implementation
        Sample1 obSample1 = () -> System.out.println("Simplifing Lamba Expression");
        obSample1.display1();

        //Single line Implementation which accepts Parameter
        //Its not necessary to declare the datatype of param in Lambda Expression
        //if its single param () is not required
        int iparam = 10;
        AcceptsParemeter acceptsParemeter = i -> System.out.println("Lamba Expression Accepts Parameter : " + i);
        acceptsParemeter.Print(iparam);

        //Single line Implementation which accepts 2 Parameters
        //Params used in Lambda Expression is considered as Declaration
        // -> Meaning the name of param should not be same as what you pass in the method while calling with object
        int param1 = 10;
        int param2 = 20;
        AcceptsTwoParams acceptsTwoParams = (parm1, parm2) -> System.out.println("Addition : " + (param1+param2));
        acceptsTwoParams.Add(param1, param2);
    }
}

interface Sample {
    void display();
}

interface Sample1 {
    void display1();    
}

interface AcceptsParemeter {
    void Print(int i);
}

interface AcceptsTwoParams {
    void Add(int i, int j);
}