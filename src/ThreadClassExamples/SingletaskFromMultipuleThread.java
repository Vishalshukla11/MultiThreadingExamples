package ThreadClassExamples;

class SingletaskFromMultipuleThread extends Thread
{
public void run()
{
    System.out.println("Single task but multilpule thread");
}

public static void main (String args[]) //main thread created by jvm
{
    SingletaskFromMultipuleThread st= new SingletaskFromMultipuleThread(); //thread 1
    st.start(); 
    SingletaskFromMultipuleThread s2= new SingletaskFromMultipuleThread(); //thread 2
    s2.start();
}
}