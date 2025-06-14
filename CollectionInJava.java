 /*
 * Collection API --> Concept
 * Collection --> Interface
 * Collections --> Class
 * Collections is used to store multiple values
 * Data Structure : Stack - Last In First Out ; Queue - First In First Out
 * 
 * If need to access the collection with Index Values use List Reference Object else Collection, set
 * Unlike Array, Collections will allow to print the list values in [] braces , seperated by default
 * List will allow duplicate values
 * Set work with HashSet,TreeSet etc. 
 * Set allows only unique values.
 * TreeSet - Unique and Sorted Values
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInJava {
    public static void main(String[] args) {

        //Collection
        System.out.println("Collection Class");

        Collection<Integer> nCollection = new ArrayList<Integer>();
        nCollection.add(5);
        nCollection.add(4);
        nCollection.add(2);
        nCollection.add(8);

        for (int i : nCollection){
            System.out.println(i);
        }

        System.out.println(nCollection);
        
        //List
        System.out.println("List Class");

        List<Integer> nIntegers = new ArrayList<Integer>();
        nIntegers.add(8);
        nIntegers.add(4);
        nIntegers.add(0);
        nIntegers.add(2);

        System.out.println(nIntegers.get(3));
        System.out.println(nIntegers);
        nIntegers.set(2,10);
        System.out.println(nIntegers);

        //Set-HashSet
        System.out.println("Set - HashSet Class");

        Set<Integer> sIntegers = new HashSet<Integer>();
        sIntegers.add(8);
        sIntegers.add(4);
        sIntegers.add(0);
        sIntegers.add(2);
        sIntegers.add(4);

        for(int i : sIntegers){
            System.out.println(i);
        }

        //Set-TreeSet
        System.out.println("Set - TreeSet Class");

        Set<Integer> tIntegers = new TreeSet<Integer>();
        tIntegers.add(8);
        tIntegers.add(4);
        tIntegers.add(0);
        tIntegers.add(2);
        tIntegers.add(4);
        tIntegers.add(10);
        tIntegers.add(15);

        for(int i : tIntegers){
            System.out.println(i);
        }

        System.out.println("Iterating using Iterator Class");
        //Iterate the Collection using Iterator Class
        Iterator<Integer> values = tIntegers.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
