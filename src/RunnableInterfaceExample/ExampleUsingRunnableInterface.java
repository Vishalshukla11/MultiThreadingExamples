package RunnableInterfaceExample;
class ExampleUsingRunnableInterface implements Runnable
{

    @Override
    public void run() {
       System.out.println("hello sir");
    }

    public static void main(String args[])
    {
        ExampleUsingRunnableInterface er= new ExampleUsingRunnableInterface();
        Thread t= new Thread(er);
        t.start();
    }

}