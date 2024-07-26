package ThreadManagementMethods;
/*isAlive()
Use: Checks if the thread is currently alive.
Without It: You cannot determine if the thread is still running or has completed.
Preferred Because: It helps in checking the status of the thread for synchronization or other control mechanisms.
 */
class IsAliveMethod extends Thread
{
public void run()
{
    try {
        Thread.sleep(2000);
        
    } catch (Exception e) {
e.printStackTrace();
    }
}
}
class MainIsAlive
{
    public static void main(String[] args) {
        IsAliveMethod i= new IsAliveMethod();
        i.start();
        System.out.println("Thread is alive: " + i.isAlive()); //true
        try {
            i.join();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        System.out.println("Threas is alive: " + i.isAlive()); //false
    
        
    }
   
}