package ThreadManagementMethods;
/*setPriority(int newPriority)
Use: Sets the priority of the thread.
Without It: The thread will use its default priority.
Preferred Because: It helps in controlling the scheduling order of threads. */
class SetPriorityMethod extends Thread
{
    public void run()
    {
        System.out.println("Thread priority: " + getPriority());
    }

}

class MainSetPriority{
    public static void main(String args[])
    {
        SetPriorityMethod s= new SetPriorityMethod();
         s.setPriority(Thread.MAX_PRIORITY);
    //  s.setPriority(s.MAX_PRIORITY);
        s.start();
    }
}