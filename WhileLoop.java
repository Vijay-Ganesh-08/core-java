/*
 * Loops are used when you want to iterate set of statements based on condition and to stop at some point
 * While - Checks the condition and executes until the conditions are matched/true
 */
public class WhileLoop {

    public static void main(String[] args) {
        
        int i = 1;
        while (i<=5){
            System.out.println("Hello There !! " + i);
            i++;
            
            int j = 1;
            while (j<=3){
                System.out.println("Nested While Loop " + j);
                j++;
            }
        }

        System.out.println(i);
    }
    
}
