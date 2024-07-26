package ThreadManagementMethods;

/*join()

Explanation: The join() method allows one thread to wait for the completion of another.
Usage: It is used when you need one thread to finish before the other thread can continue.
What happens if we don't use it: Without join(), the current thread may continue running without waiting for the other thread to complete.
Preference: It ensures sequential execution when required
 */
class JoinMethod extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running.");
        }
    }


  public static void main(String args[]) 
    {
        JoinMethod j= new JoinMethod();
        j.start();
       try
       {
        j.join(); // this waits for j to finish
       } catch (Exception e) {
        e.printStackTrace();
       }

    System.out.println("Main thread finished.");
    }

}