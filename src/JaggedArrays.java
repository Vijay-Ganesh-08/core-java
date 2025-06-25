package src;
/*
 * JaggedArrays is an Array of Arrays with different size/length of same type
 */

import java.util.Random;

public class JaggedArrays {

    public static void main(String[] args) {

        int nums[][] = new int[3][];
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[5];

        Random random = new Random();
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = random.nextInt(10);
            }
        }

        for(int n[] : nums){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
