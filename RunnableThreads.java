 /*
 * Thread is implemented by Runnable interface by default
 * if a class implements Runnable and when Thread needs to be involved it can be done only by Thread object.
 * Runnable Threads can be implemented using Anonymous Class and Lambda Expression
 */

public class RunnableThreads {
    public static void main(String[] args){
        Runnable obj1 = new sample();
        Runnable obj2 = new sample1();
        Thread thread = new Thread(obj1);
        Thread thread1 = new Thread(obj2);
        thread.start();
        thread1.start();

        // OR - Below Code - Both are same 

        sample obj3 = new sample();
        sample1 obj4 = new sample1();
        Thread thread2 = new Thread(obj3);
        Thread thread3 = new Thread(obj4);
        thread2.start();
        thread3.start();


        //Through Anonymous class
        Runnable runnable1 = new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("Executing Through Anonymous Class");
                }
            }
        };
        Thread thread4 = new Thread(runnable1);
        thread4.start();

        //Through Lambda Expression
        Runnable runnable2 = () ->
        {
                for(int i=0;i<10;i++){
                    System.out.println("Executing Through Lambda Expression");
                }
        };
        Thread thread5 = new Thread(runnable2);
        thread5.start();

    }
}

class sample implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Sample");
        }
    }
}

class sample1 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Sample 1");
        }
    }
}