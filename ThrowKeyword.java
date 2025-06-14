/*
 * Throw Keyword is used to throw the exception manually
 */

public class ThrowKeyword {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 0;

        try{
            c = a/b;
            if (c==0)
                throw new Exception();
        }
        catch(ArithmeticException ex){
            System.out.println("ArithmeticException : " + ex);
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
