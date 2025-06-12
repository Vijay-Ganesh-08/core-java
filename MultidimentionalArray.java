/*
 * MultiDimentional Array is an Array of Arrays with fixed size/length of same type
 */

import java.util.Random;

public class MultidimentionalArray {

    public static void main(String[] args) {
        
        int[][] nums = new int[3][4]; //3 rows and 4 columns
        
        Random random = new Random(); //Random Class which creates random values

        for(int i = 0; i<3; i++){
            for(int j=0;j<4;j++){
                nums[i][j] = random.nextInt(10); //Method to create next random values less than 10
            }
        }

        System.out.println("Normal For Loop");
        for(int i = 0; i<3; i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced For Loop");
        //Enhanced For Loop
        for(int n[] : nums){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}