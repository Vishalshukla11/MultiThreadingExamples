package ThreadManagementMethods;
/*isInterrupted()

Explanation: The isInterrupted() method checks if the thread has been interrupted.
Usage: It is used to check the interruption status of a thread.
What happens if we don't use it: Without checking interruption, a thread may not respond appropriately to interrupt signals.
Preference: It helps in managing the thread's behavior based on its interruption status.
 */
class isInterrupted extends Thread
{
    public void run()
    {
        while(!isInterrupted())
        {
         System.out.println("Thread is running.");
        }
        System.out.println("Thread is inTerrupted.");
    }

    public static void main(String args[])
    {
        isInterrupted is= new isInterrupted();
        is.start();
       boolean ir = is.isInterrupted();
       System.out.println(ir);
    }

}