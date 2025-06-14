import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AltimetrixInterviewQuestion {
    public static void main(String[] args) {
        //AltemetricQuestion -- Sort and Diff Odd/Even
        List<Integer> nums = Arrays.asList(1,5,3,7,8,4,2,6,9,0,10);
        System.out.println("UnSorted : " + nums);
        Collections.sort(nums);
        System.out.println("Sorted : " + nums);
        
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for(int num : nums){
            if(num%2==0){
                evenList.add(num);
            }
            else{
                oddList.add(num);
            }
        }
        System.out.println("Even : " + evenList);
        System.out.println("Odd : " + oddList);
    }
}
