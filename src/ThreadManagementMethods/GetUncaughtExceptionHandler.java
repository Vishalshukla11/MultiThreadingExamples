package ThreadManagementMethods;
/*getUncaughtExceptionHandler()
Use: Retrieves the handler for uncaught exceptions in the thread.
Without It: The thread will use the default uncaught exception handler.
Preferred Because: It allows you to handle exceptions that are not caught within the thread’s run method.
 */
class GetUncaughtExceptionHandler extends Thread
{
public void run()
{
    throw new RuntimeException("Test Exception");
}
}
class MainUncaughtException
{
    public static void main(String args[])
    {
        GetUncaughtExceptionHandler g= new GetUncaughtExceptionHandler();
        g.setUncaughtExceptionHandler((Thread,exc) ->
        {
        System.out.println("Exception Caught: " + exc.getMessage());
        });
        g.start();
    }
}