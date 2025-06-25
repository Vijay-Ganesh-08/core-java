package src;
/*
 * Scanner class is used to get the input from the user.
 * Scanner object needs to be closed once done with the program.
 */
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Number :" + num);


        System.out.print("Enter the Array Size:");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0;i<size;i++){
            nums[i] = scan.nextInt();
        }

        for(int numArray : nums){
            System.out.println("Array Element :" + numArray);
        }

        for (int i = 0;i<size;i++){
            System.out.println("Array Element of Index " + i + " is " + nums[i]);
        }
        scan.close();
    }
}
