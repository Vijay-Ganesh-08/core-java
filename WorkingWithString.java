/*
 * String is stored in both Stack (Refs to Heap Location) and Heap (Value of String)
 * Any Update done to a String variable creates a new location in Heap and updates the Refs in Stack
 * When same value is assigned to different variable, it has different variables in stack but pointing to same Refs in Heap
 * Immutable - Something cannot be changed , String is immutable in nature.
 * Muttable - Something can be changed , StringBuilder and StringBuffer
 * StringBuffer - Thread Safe
 * StringBuilder - Not Thread Safe
 */

public class WorkingWithString {

    public static void main(String[] args) {
        String name = new String("Vijay");
        String name1 = "Vijay";

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        //Any Manipulations done to String Object changes the HashCode (Heap Refs)
        name = name + " Ganesh";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        //Any Manipulations done to StringBuffer Object Doesn't change the HashCode (Heap Refs)
        StringBuffer sBuffer = new StringBuffer("Vijay");
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.hashCode());
        System.out.println(sBuffer);
        sBuffer.append("Ganesh");
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.hashCode());
        System.out.println(sBuffer);
        sBuffer.insert(5, " ");
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.hashCode());
        System.out.println(sBuffer);
    }
    
}
