/*
 * Loops are used when you want to iterate set of statements based on condition and to stop at some point
 * For Loops is used when you have finite loop meaning, you know the iteration count
 * Ex. Reading the Array with the length of Array as limit etc.
 */
public class ForLoop {

    public static void main(String[] args) {
        

        //Incremental Loop
        for(int i = 1; i <= 5; i++){
            System.out.println("Incremental " + i);
        }

        System.out.println(); // Line Seperator

        //Decremental Loop
        for(int i = 5; i >= 1; i--){
            System.out.println("Decremental " + i);
        }
        
        System.out.println(); // Line Seperator

        //Nested for Loop
        for(int i = 1; i <= 5; i++){
            System.out.println("DAY : " + i);

            for (int j=9; j<=17; j++){
                System.out.println(" Working Hours : " + j + " - " + (j+1));
            }
        }

        System.out.println(); // Line Seperator

        // * X Rows Incremental
        for (int i = 0; i <= 10 ; i++){
            
            for (int j = 0;j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println(); // Line Seperator
        
        // Normal Nested Loops
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("x");
            }
            System.out.println();
        }

        System.out.println(); // Line Seperator
        
        // * X Rows Decremental
        for(int i=5;i>0;i--){
             for(int j=0;j<i;j++){
                 System.out.print("x");
             }
             System.out.println();
        }
    }
    
}
