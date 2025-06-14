/*
 * Custom Exceptions are used to Customize the exceptions based on business needs
 * Class which extends Exception class is called Custom Exception
 */

public class CustomException {

    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 0;

        try{
            c = a/b;
            if (c==0)
                throw new CustomizedException("Custom Exception Thrown");
        }
        catch(Exception ex){
            System.out.println("GenericException : " + ex);
        }
        finally{
            System.out.println(a + " " + b + " " + c);
            System.out.println("Program Ended");
        }

    }
    
}


class CustomizedException extends Exception{

    CustomizedException(String message){
        super(message);
    }
}