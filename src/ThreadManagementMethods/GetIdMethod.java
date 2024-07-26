package ThreadManagementMethods;
/*getId()
Use: Returns the ID of the thread.
Without It: You cannot retrieve the thread’s unique identifier.
Preferred Because: It helps in identifying and managing threads uniquely.
 */
class GetIdMethod extends Thread
{
    public void run()
    {
        System.out.println("Thread Id: " + getId());
    }

}
class MainGetID{
public static void main(String args[])
{
    GetIdMethod g= new GetIdMethod();
    g.start(); 
}
}