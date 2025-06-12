/*
 * Storing multiple values of same type into a single variable
 * Stored in Heap memory, Size once declared cannot be modified.
 */
public class Arrays {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int num1[] = new int[5];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;

        String names[] = {"Vijay","Ganesh","John","Peter"};
        char cArray[] = {'a','b','c','d'};

        //Accessing specific Elements in an Array
        System.out.println(num[0]); //Accessing 1st element of Array
        System.out.println(num1[1]); //Accessing 2nd element of Array
        System.out.println(names[2]); //Accessing 3rd element of Array
        System.out.println(cArray[3]); //Accessing 4th element of Array

        //Updating values of Array
        num[4] = 10; //Updating 5th element of Array
        num1[3] = 15; //Updating 4th element of Array
        names[1] = "Rodrick"; //Updating 2nd element of Array
        cArray[2] = 'z'; //Updating 3rd element of Array

        //Accessing All items of an Array
        System.out.println("Int Array1");
        for(int i = 0; i<num.length; i++){
            System.out.println(num[i]);
        }

        System.out.println("Int Array2");
        for(int i = 0; i<num1.length; i++){
            System.out.println(num1[i]);
        }

        System.out.println("String Array");
        for(int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Char Array");
        for(int i = 0; i<cArray.length; i++){
            System.out.println(cArray[i]);
        }
    }
}