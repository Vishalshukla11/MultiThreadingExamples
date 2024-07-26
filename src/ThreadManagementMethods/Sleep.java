package ThreadManagementMethods;
/*sleep(long millis, int nanos)

Explanation: The sleep(long millis, int nanos) method pauses the execution of the current thread for the specified number of milliseconds and nanoseconds.
Usage: It is used to make the thread sleep for a more precise duration.
What happens if we don't use it: Without precise sleep control, the thread might not pause for the exact required time.
Preference: It allows for finer control over the sleep duration.
 */
class Sleep extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread is running " + i);
           try{
            Thread.sleep(1000);
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
    }
}

class Main3 {
    public static void main(String args[]) {
        Sleep s = new Sleep();
        s.start();
    }
}