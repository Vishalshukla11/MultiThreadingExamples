package ThreadManagementMethods;
/*yield()

Explanation: The yield() method causes the currently executing thread to pause and allow other threads of the same priority to execute.
Usage: It is used to give other threads an opportunity to execute.
What happens if we don't use it: Without yield(), the current thread might not pause and continue to hold the CPU.
Preference: It helps in improving the performance by allowing other threads to execute
 */
class yieldMethod extends Thread 
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("Child Thread");
            Thread.yield(); // cause the currently Executing Thread to yield execution 
        }
    }

}

class Main5{
    public static void main(String args[])
    {
        yieldMethod y= new yieldMethod();
        y.start();
        for(int i=0;i<50;i++)
        {
            System.out.println("Main thread");
        }

    }
}