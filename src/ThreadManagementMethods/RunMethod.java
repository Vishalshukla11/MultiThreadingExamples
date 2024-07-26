package ThreadManagementMethods;
/*run()

Explanation: The run() method contains the code that constitutes the new thread's task. It is called when the thread is started.
Usage: Override this method with the code that you want to run in parallel.
What happens if we don't use it: If you don't override run(), the thread will not perform any specific task.
Preference: It is essential to override this method to define the task for the thread.
 */

class RunMethod implements Runnable
{

    @Override
    public void run() {
        
    System.out.println("Thread is running.");
}

public static void main(String args[])
{
    RunMethod r= new RunMethod();
    Thread t= new Thread(r);
    t.start();
}


}