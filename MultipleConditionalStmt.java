/*
 * Decision making statements based on the outcome of conditions
 * Conditional statements helps to execute the piece of code
 * if..else if..else helps us with multiple conditional statements in java
 */
public class MultipleConditionalStmt {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 15;
        int c = 20;

        if(a>b && a>c){
            System.out.println("A is Greater than B and C");
        } else if (b>c){
            System.out.println("B is Greater than A and C");
        } else {
             System.out.println("C is Greater than A and B");
        }
    }
    
}
