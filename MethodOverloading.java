/*
 * Method overloading is done to update the version of the methods
 * Method overloading is nothing but we have same method names but different behaviors
 * Can be done with different num of parameters/order of parameters
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int result = 0;
        calc obj = new calc(); 
        result = obj.add(a, b); 
        System.out.println(result);
        result = obj.add(a, b, c); 
        System.out.println(result);

    }
}


class calc {

    int add(int a, int b) {
        return a+b;
    }

    int add (int a, int b, int c){
        return a+b+c;
    }
}