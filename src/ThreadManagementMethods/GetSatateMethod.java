package ThreadManagementMethods;
/*getState()

Use: Returns the state of the thread.
Without It: You cannot determine the current state of the thread.
Preferred Because: It allows you to monitor and react to the thread's state.
 */
class GetSatateMethod extends Thread
{
    public void run()
    {
        System.out.println("Thread is running.");
    }

}

class Main{
    public static void main(String args[])
    {
        GetSatateMethod g = new GetSatateMethod();
        System.out.println("Thread State:" + g.getState()); //New 
        g.start();
        System.out.println("Thread State after start method: " + g.getState()); //Runnable 

    }
}