package src;
/*
 * Its not a compulsion to declare the type in both sides at the time of instantiation
 * List<Integer> nIntegers = new ArrayList<>(Integer); --> Not Mandatory
 * List<Integer> nIntegers = new ArrayList<>(); --> This should suffice
 * Collections.sort can be used to sort the Collection Data.
 * Comparator - Is a concept to implement custom sorting logic, can be invoked with Lambda Expression
 * Comparable - Providing power to a class to compare itself by implementing the logic in compareTo() method and This Keyword.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
        //Collections.sort
        System.out.println("Using Default Collection Sorting Method");
        List<Integer> nIntegers = new ArrayList<>();
        nIntegers.add(10);
        nIntegers.add(17);
        nIntegers.add(11);
        nIntegers.add(19);
        nIntegers.add(16);
        nIntegers.add(15);
        nIntegers.add(12);
        nIntegers.add(10);

        System.out.println(nIntegers);

        Collections.sort(nIntegers);
        System.out.println(nIntegers);

        //Comparator - Custom Sorting
        System.out.println("Using Custom Comparator Sorting Method");

        List<Integer> nIntegers2 = new ArrayList<>();
        nIntegers2.add(56);
        nIntegers2.add(31);
        nIntegers2.add(67);
        nIntegers2.add(93);
        nIntegers2.add(45);

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(nIntegers2,comp);
        System.out.println(nIntegers2);


        // //Lowe's Interview Question
        // System.out.println("Lowe's Interview Question");

        // List<Integer> listInt = new ArrayList<>();
        // listInt.add(1);
        // listInt.add(2);
        // listInt.add(3);
        // listInt.add(4);
        // listInt.add(5);
        // listInt.add(6);
        // listInt.add(7);
        // listInt.add(8);
        // listInt.add(9);
        // listInt.add(10);

        // System.out.println(listInt);

        // Comparator<Integer> cArray = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j){
        //         if(i%3==0) {
        //              if (j%3==0) {
        //                 return 1;
        //              }
        //         }
        //             return -1;
        //     }
        // };

        // Collections.sort(listInt,cArray);
        // System.out.println(listInt);

        //List of Object
        System.out.println("List of Objects");
        System.out.println("Normal Implemention of Comparator class");
        
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Vijay", 17));
        studs.add(new Student("Arun", 17));
        studs.add(new Student("Ajay", 16));
        studs.add(new Student("Aravind", 15));
        studs.add(new Student("Akash", 18));

        System.out.println("Before Sorting");

        for(Student stud : studs){
            System.out.println(stud);
        }

        //Normal Implemention of Comparator class
        Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age > j.age)
                    return 1;
                else 
                    return -1;
            }
        };

        System.out.println("After Sorting");
        Collections.sort(studs,comparator);
        // System.out.println(studs);
        for(Student stud : studs){
            System.out.println(stud);
        }

        System.out.println("Lambda Implemention of Comparator class");

        List<Student> studs1 = new ArrayList<>();
        studs1.add(new Student("Vijay", 17));
        studs1.add(new Student("Arun", 17));
        studs1.add(new Student("Ajay", 16));
        studs1.add(new Student("Aravind", 15));
        studs1.add(new Student("Akash", 18));

        System.out.println("Before Sorting");
        for(Student stud : studs1){
            System.out.println(stud);
        }

        Comparator<Student> cLambda = (i, j) -> i.age > j.age? 1:-1;
        Collections.sort(studs1,cLambda);
        System.out.println("After Sorting");
        for(Student stud : studs1) {
            System.out.println(stud);
        }
    }
}


class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}