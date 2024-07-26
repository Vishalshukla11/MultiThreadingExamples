package ThreadManagementMethods;
/*getName()
Use: Returns the name of the thread.
Without It: You cannot retrieve the name of the thread.
Preferred Because: It helps in identifying and debugging threads.
 */
class GetNameMethod extends Thread
{public void run()
    {
        System.out.println("Thread name: " + getName());
    }
}

class Main{
    public static void main(String args[])
    {
        GetNameMethod g= new GetNameMethod();
        g.start();
    }
}