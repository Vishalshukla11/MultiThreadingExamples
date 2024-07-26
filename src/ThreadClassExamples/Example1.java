package ThreadClassExamples;
// this is a first way to do using thread class 
class Example1 extends Thread
{
    @Override
    public void run()
    {
      System.out.println("Example1");
    }

    public static void main(String args[])
    {
        Example1 e = new Example1();
        e.start();
    }
    
}