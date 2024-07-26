package ThreadManagementMethods;
/*setName(String name)
Use: Sets the name of the thread.
Without It: The thread will have a default name assigned by the JVM.
Preferred Because: It helps in identifying and debugging threads by assigning meaningful names.
 */
class SetNameMethod extends Thread
{
    public void run()
    {
        System.out.println("Thread name:"+ getName());
    }

}
class MainsetName{
    public static void main(String args[])
    {
        SetNameMethod s= new SetNameMethod();
        s.setName("Custom Thread");
        s.start();
    }
}