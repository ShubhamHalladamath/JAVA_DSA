import java.util.Arrays;
import java.util.Scanner;

// Using threads and join() to print in sequence
class NewThreadj implements Runnable {
    public static final Object lock=new Object();
    String name; // Name of the thread

    // Constructor to create and start a thread
    NewThreadj(String threadname) {
        name = threadname;
    }

    // Entry point for the thread
    @Override
    public synchronized void run() {
        synchronized (lock){ try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);

                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
    }
}

public class rough {
    public static void main(String[] args) {
        NewThreadj ob1 = new NewThreadj("One");
        Thread t1=new Thread(ob1);
        NewThreadj ob2 = new NewThreadj("Two");
        Thread t2=new Thread(ob2);

        NewThreadj ob3 = new NewThreadj("Three");
        Thread t3=new Thread(ob3);
        t1.start();
        t2.start();
        t3.start();

        // Ensure all messages from one thread are printed before moving to the next
//        try {
//            t1.join(); // Wait for Thread One to finish
//           t2.join(); // Wait for Thread Two to finish
//           t3.join(); // Wait for Thread Three to finish
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }

        System.out.println("Main thread exiting.");
    }
}
