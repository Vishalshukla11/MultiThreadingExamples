package ThreadClassExamples;

class SingleTaskWithSingleThread extends Thread
{
    // public void run()
    // {
    //     System.out.println("Run1");
    // }
    public void run() 
    {
        System.out.println("Using run method");
    }
    public void  Print()
    {
        System.out.println("Hello ");
    }

    public static void main (String args[])
    {
        SingleTaskWithSingleThread s= new SingleTaskWithSingleThread();
        s.start();
    }


}