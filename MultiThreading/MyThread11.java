class MyThread11 extends Thread
{
    public void run()
    {
        System.out.println("Running");
    }
}

class Main
{
    public static void main(String args[])
    {
        MyThread11 t = new MyThread11();

        System.out.println(t.isAlive());
    }
}