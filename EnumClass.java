/*
 * Enum (Enumeration) class is nothing but a class contains named Constants
 */

public class EnumClass {
    public static void main(String[] args) 
    {
        System.out.println(Status.Running);
        System.out.println(Status.Pending);
        System.out.println(Status.Failed);
        System.out.println(Status.Success);
       
        Status[] status = Status.values();
        for (Status s : status){
            System.out.println(s + " : " + s.ordinal());
        }

        
    }
}
enum Status {
    Running, Pending, Failed, Success;
}