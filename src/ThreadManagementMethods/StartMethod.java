package ThreadManagementMethods;
/*start()

Explanation: The start() method is used to begin the execution of a thread. When you call start(), the run() method of the thread is invoked in a new call stack.
Usage: It initializes the new thread and executes the code inside the run() method concurrently.
What happens if we don't use it: If you don't call start(), the run() method will not execute in a separate thread, and the code will run on the main thread instead.
Preference: It is preferred to use start() when you want to perform concurrent operations.
 */
class StartMethod extends Thread{
    public void run()
    {
        System.out.println("Thread is running.");
    }

    public static void main(String args[])
    {
        StartMethod s= new StartMethod();
        s.start();
    }

}