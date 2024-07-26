package ThreadManagementMethods;
/*getPriority()
Use: Returns the priority of the thread.
Without It: You cannot determine the priority of the thread.
Preferred Because: It helps in understanding the thread's scheduling priority.
 */
class GetPriorityMethod extends Thread 
{
public void run()
{
    System.out.println("Thread priority: " + getPriority());
}
}
class MainGetPriority
{
    public static void main(String args[])
    {
        GetPriorityMethod g= new GetPriorityMethod();
        g.start();

    }
}