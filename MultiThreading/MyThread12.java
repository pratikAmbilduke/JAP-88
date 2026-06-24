class MyThread12 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        MyThread12 t = new MyThread12();

        System.out.println("Before Start : "
                           + t.isAlive());

        t.start();

        System.out.println("After Start : "
                           + t.isAlive());
    }
}