package src;
/*
 * Exceptions are nothing but the error which occured while executing the Program
 * Types of Errors:
 * Compile Time Error : Errors occured at the time of compiling the Program
 * Ex : Syntax Error, TypeCasting Error etc
 * Run Time Error : When the expected output is not acheived and it stops the execution
 * Ex : File not found at the execution time, Connection to DB error, Array Index 
 * Logical Error : Error with the logic implemented.
 * Ex : 2+2 = 4 but implemented as 2+2=5
 * 
 * All RunTime Exceptions are UnChecked Exceptions (Ex. NullPointer, ArrayIndex, Arithmetic etc), its developer's responsibility to handle the exception.
 * Checked Exceptions are Possible Exceptions which can impact the execution (IO, SQL Exception etc), compiler will force you to handle the exception.
 * 
 * Exceptions are Run Time Errors occured in the program.
 * Try block is used to execute the critical statement which has potentials to through exception
 * Catch block is used to catch the exception thrown by try block and handles it
 * Finally block is used to execute set of statement irrespective of exception is being throw or not
 * usually finally block is used to close the resources like IO stream, Scanner etc
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 2;
        int c = 0;

        int[] nums = new int[5];

        try{
            c = a/b;
            System.out.println(nums[5]);
        }
        catch(ArithmeticException ex){
            System.out.println("ArithmeticException : " + ex);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException : " + ex);
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
