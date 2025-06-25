package src;
/*
 * Map is collection of values with Key,Value pair
 * Unique Key, any modification to the key updates the value
 * Map is a combination of Set (Key - Unique Value) and List (Value - Duplicate Values)
 * HashMap can allow atmost 1 Key as Null and Duplicate Null in Values
 * HashTable will not allow Null in both Key or Values
 */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        //HashMap
        System.out.println("HashMap");
        Map<String,Integer> student = new HashMap<>();
        student.put("Vijay", 79);
        student.put("Arun", 68);
        student.put("Arjun", 84);
        student.put("Vivek", 94);
        student.put("Vijay", 100);
        student.put(null, 67);
        student.put(null, 96);
        student.put("Ashwin", null);
        student.put("Arvind", null);
      
        System.out.println(student.get("Vijay"));
        System.out.println(student.get(null));
        System.out.println(student);
        System.out.println(student.keySet());
        System.out.println(student.values());

        for(String key : student.keySet()){
            System.out.println(key + " : " + student.get(key));
        }

        //HashMap - Synchronized by default (Multiple Threads)
        System.out.println("HashTable");
        Map<String,Integer> student1 = new Hashtable<>();
        student1.put("Vijay", 79);
        student1.put("Arun", 68);
        student1.put("Arjun", 84);
        student1.put("Vivek", 94);
        student1.put("Vijay", 100);
        // student1.put("Ashwin", null);
        // student1.put("Arvind", null);
      
        System.out.println(student1.get("Vijay"));
        System.out.println(student1);
        System.out.println(student1.keySet());
        System.out.println(student1.values());

        for(String key : student1.keySet()){
            System.out.println(key + " : " + student1.get(key));
        }
    }
}