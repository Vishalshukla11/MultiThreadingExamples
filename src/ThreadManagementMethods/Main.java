package ThreadManagementMethods;
/*join(long millis)

Explanation: The join(long millis) method makes the current thread wait for the specified time for the thread to finish.
Usage: It is used when you need to wait for a thread for a limited time.
What happens if we don't use it: Without specifying a timeout, the current thread will wait indefinitely.
Preference: It allows controlling the waiting time for a thread.
 */
class JoinsLongMillis extends Thread
{
  public void run()
  {
     for(int i=0;i<5;i++)
     {
        System.out.println("running");
     }
  }
} 
class Main{
public static void main(String args[])
{
   JoinsLongMillis jm= new JoinsLongMillis();
   jm.start();
try {
   jm.join(1000); // this will wiat for jm for 1000 miliseconds

} catch (Exception e) {
   e.printStackTrace();
}

   System.out.println("Main thread conyinues after waiting for 1 second.");
}
}