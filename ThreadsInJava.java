/*
 * Threads are used to perform multiple task at the same time
 * Threads flows cannot be defined but the priority can be set
 * Class extending Thread is considered as Threads by default
 * Thread class must contain public void run method
 * class.start() is used to execute the run methods from the Thread class.
 * Thread Priority 10-Max 5-Normal 1-Min, Priority is used to suggest the OS Scheduler to set the Execution Priority
 * Thread Sleep is to let the scheduler to wait for Execution when you want other thread to execute
*/

public class ThreadsInJava {
    public static void main (String[] args){
        primary primaryObj = new primary();
        secondary secondaryObj = new secondary();
        primaryObj.setPriority(Thread.MAX_PRIORITY);
        secondaryObj.setPriority(Thread.NORM_PRIORITY);
        primaryObj.start();
        secondaryObj.start();
    }
}

class primary extends Thread {
    public void run(){
        for(int i = 0;i<20;i++){
            System.out.println("Primary Thread Runs");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class secondary extends Thread {
    public void run(){
        for(int i = 0;i<20;i++){
            System.out.println("Secondary Thread Runs");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}