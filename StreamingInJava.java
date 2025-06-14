/*
 * Stream is implemented to Collection in different types
 * Stream can be used only once in the execution.
 * Any Changes/Data Manipulations will not affect the actual list of collection. 
 * 
 * Filter is used to filter the values in list based on the given condition
 * --> Filter is derived from Predicate FunctionalInterface and the statement given in filter is a Lambda Expression of a implementation since Predicate return Boolean (test Method)
 * In the below example filter is used to filter the even numbers from intList
 * Map is used to manipulate the value and replace the values in the list
 * --> Map is derived from Function FunctionalInterface and the statement given in map is a Lambda Expression of a implementation since Function return Integer (apply Method)
 * * In the below example map is used to multiple the even numbers from intList by 2
 * reduce - is the action which needs to be taken at the time of execution
 * --> Reduce is derived from BinaryOperator and BiFuction Functional Interfaces, identity is the starting point, c and e and 2 different values and c+e is the output needed. 
 * In the below example reduce sums up the even numbers in the intList which is muliplied by 2 in map statement 
 * 
 * Parallel Stream is another function of stream which helps the execution in multiple Threads.
 * Not to use Parallel Stream when you want to sort the elements
 */

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamingInJava {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,4,5,7,3,8,2,9,6);
        Stream<Integer> stream = intList.stream();
        // stream.forEach(n->System.out.println(n));
        Stream<Integer> stream1 = stream.filter(n->n%2==0);
        // stream1.forEach(n->System.out.println(n));
        Stream<Integer> stream2 = stream1.map(n->n*2);
        // stream2.forEach(n->System.out.println(n));
        int result = stream2.reduce(0, (c,e)->c+e);
        System.out.println(result);

        // --> Can also be written as below

        int result1 = intList.stream()
                            .filter(n->n%2==0)
                            .map(n->n*2)
                            .reduce(0, (c,e)->c+e);
        System.out.println(result1);

        //Stream with Sort
        Stream<Integer> sortedStream = intList.stream()
        .filter(n->n%2==0)
        .sorted();
        sortedStream.forEach(n->System.out.println(n));

        //Parallel Stream --> Unsorted
        Stream<Integer> pStream = intList.parallelStream().filter(n->n%2==0);
        pStream.forEach(n->System.out.println(n));

    }
}