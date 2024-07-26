package ThreadClassExamples;

class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Vlc Player is open");
    }

}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Video is playing");
    }
   

}
class Thread3 extends Thread
{
    public void run()
    {
        System.out.println("Timer is working ");
    }

}
class Thread4 extends Thread{
    public void run()
    {
        System.out.println("Volume is increasing");
    }

}

class Main extends Thread
{
public static void main(String args[])
{
    Thread1 t1 = new Thread1();
    Thread2 t2= new Thread2();
    Thread3 t3= new Thread3();
    Thread4 t4= new Thread4();

    t1.start();
    t2.start();
    t3.start();
    t4.start();

}
}