package src;
/*
 * Array of Object is nothing but containing values of a class properties as objects in a Array
 * its basicaly a array of class data type
 */

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNum = 1;
        s1.name = "John";
        s1.marks = 76;
        Student s2 = new Student();
        s2.rollNum = 1;
        s2.name = "Peter";
        s2.marks = 73;
        Student s3 = new Student();
        s3.rollNum = 1;
        s3.name = "Rodrick";
        s3.marks = 69;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student student2 : student){
            System.out.println(student2.name + ":" + student2.marks);
        }

    }
}

class Student {
    int rollNum;
    String name;
    int marks;
}
