package ThreadManagementMethods;
/*getThreadGroup()
Use: Returns the thread group to which the thread belongs.
Without It: You cannot determine the group of the thread.
Preferred Because: It helps in managing and organizing threads into groups.
 */
class getThreadGRoup extends Thread
{
    public void run()
    {
        System.out.println("Thread ID: " + getThreadGroup());
    }

}

class MainGetThreadGroup
{
    public static void main(String args[])
    {
        getThreadGRoup g= new getThreadGRoup();
        g.start();
    }

}