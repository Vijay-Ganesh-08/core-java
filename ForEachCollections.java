/*
 * ForEach is a class to iterate through the collections.
 * Various possible ways to iterate the collection -> For Loop, Enhanced For Loop, ForEach loop.
 * ForEach is implemented through Consumer Class Lambda Expression
 */

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class ForEachCollections {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,6,7,2);

        System.out.println(nums);

        //Generic Iteration
        int sum = 0;
        for(int n : nums){
            if(n%2==0){
                n = n*2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        //Diff ways of printing the collections
        System.out.println("For Loop");
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        System.out.println("Enhanced For Loop");
        for(int num : nums){
            System.out.println(num);
        }

        System.out.println("For Each Loop");
        nums.forEach(n->System.out.println(n));

        System.out.println("For Each Loop - Advanced - Using Consumer Class Functional Interface");
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);

        System.out.println("For Each Loop - Advanced - Using Consumer Class Lambda Expression");
        Consumer<Integer> con1 = n -> System.out.println(n);
        nums.forEach(con1);
    }
}