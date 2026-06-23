class MyThread2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();

        t.start();
    }
}