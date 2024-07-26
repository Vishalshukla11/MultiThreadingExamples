package ThreadManagementMethods;
/*interrupt()

Explanation: The interrupt() method interrupts a thread that is either running or waiting. This method sets the thread's interrupt flag.
Usage: It can be used to signal a thread to stop its current task and handle the interruption.
What happens if we don't use it: Without interrupting, a thread might continue running or waiting indefinitely.
Preference: It is useful for stopping or altering the behavior of a thread in a controlled manner.
 */

public class InterruptMethod extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted.");
        }
    }

    public static void main(String args[])
    {
        InterruptMethod i= new InterruptMethod();
        i.start();
        System.out.println(i.interrupted()) ;  // interrupted the thred 
        System.out.println(Thread.interrupted()) ;  // interrupted the thred 

    }

}