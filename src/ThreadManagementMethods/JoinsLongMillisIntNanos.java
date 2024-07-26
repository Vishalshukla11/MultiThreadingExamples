package ThreadManagementMethods;

/*join(long millis, int nanos)

Explanation: The join(long millis, int nanos) method makes the current thread wait for the specified time (in milliseconds and nanoseconds) for the thread to finish.
Usage: It is used when you need to wait for a thread for a very precise time.
What happens if we don't use it: Without specifying a precise timeout, the current thread might not wait for the exact desired time.
Preference: It allows for finer control over the waiting time.
 */
class JoinsLongMillisIntNanos extends Thread {
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println("Running"+ i);
        }
    }

}

class Main1 {
    public static void main(String args[]) throws InterruptedException
     {
        JoinsLongMillisIntNanos j = new JoinsLongMillisIntNanos();
        j.start();
        j.join(1000, 500);
        // try {
        //     j.join(1000, 500);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        System.out.println("Main thread continues after waiting for the specified time.");

    }
}