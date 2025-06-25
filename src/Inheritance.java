package src;
/*
 * Inheriting properties of a class by other class called Inheritance
 * Class which is getting inherited is called Parent/Super/Base Class
 * Class which is inheriting from other class is called Child/Sub/Derived Class
 * extends is the keyword is implement Inheritance
 * Multilevel Inheritance will work Ex : Class C extends Class B extends Class A
 * Multiple Inheritance will not work Ec : Class C extends both Class B and Class A
 */
public class Inheritance {

    public static void main(String[] args) {
        
        AdvCalculator calculator = new AdvCalculator();
        int add = calculator.add(10, 20);
        int sub = calculator.sub(10, 20);
        int mul = calculator.mul(10, 20);
        int div = calculator.div(10, 20);
        
        System.out.println("S Add : " + add);
        System.out.println("S Sub : " + sub);
        System.out.println("S Mul : " + mul);
        System.out.println("S Div : " + div);

        VeryAdvCalculator veryAdvCalculator = new VeryAdvCalculator();
        int add1 = veryAdvCalculator.add(10, 20);
        int sub1 = veryAdvCalculator.sub(10, 20);
        int mul1 = veryAdvCalculator.mul(10, 20);
        int div1 = veryAdvCalculator.div(10, 20);
        int mod = veryAdvCalculator.mod(10, 20);
        
        System.out.println("M Add : " + add1);
        System.out.println("M Sub : " + sub1);
        System.out.println("M Mul : " + mul1);
        System.out.println("M Div : " + div1);
        System.out.println("M Mod : " + mod);

    }
    
}
//Parent/Super/Base
class Calculator {

    public int add (int a , int b){
        return a+b;
    }

    public int sub (int a , int b){
        return a-b;
    }
}

//Child/Sub/Derived --Level 1
class AdvCalculator extends Calculator{
    public int mul (int a , int b){
        return a*b;
    }

    public int div (int a , int b){
        return a/b;
    }
}

//Child/Sub/Derived --Level 2
class VeryAdvCalculator extends AdvCalculator{
    public int mod(int a, int b){
        return a%b;
    }
}