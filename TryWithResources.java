/*
 * Try With Resources is used to Auto Close the resources which is used in the try block
 * Its not necessary that every Try should have catch block
 * Finally block can be avoided since the resources are auto closed
 */

import java.util.Scanner;

public class TryWithResources {
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the Number");
            int num = scan.nextInt();
            System.out.println("Number Entered : " + num);
        }
    }
}
