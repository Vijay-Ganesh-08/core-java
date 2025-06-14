 /*
 * Thread.Join() is used when we want the main Thread needs to wait until the class thread is executed
 * Removing thread.join() from the below code will print some value since the main thread is ended as soon as Thread is started is called
 * Keeping thread.join() from the below code will print some value since the main thread will wait until Threads are executed
 * 
 * synchronized keyword is used to a method to restrict mutiple thread accessing at the same time
 */
public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException{

        Counter objCounter = new Counter();

        //Through Anonymous class
        Runnable runnable1 = new Runnable() {
            public void run(){
                for(int i=0;i<1000;i++){
                    objCounter.Increment();
                }
            }
        };
        
        //Through Lambda Expression
        Runnable runnable2 = () ->
        {
                for(int i=0;i<1000;i++){
                    objCounter.Increment();
                }
        };

        Thread thread4 = new Thread(runnable1);
        Thread thread5 = new Thread(runnable2);
        thread4.start();
        thread5.start();
        thread4.join();
        thread5.join();

        System.out.println(objCounter.count);

    }
}

class Counter{
    int count;
    public synchronized void Increment() {
        count++;
    }   
}