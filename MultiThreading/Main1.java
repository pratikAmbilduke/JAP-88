class Main1
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();

        ThreadGroup tg = t.getThreadGroup();

        System.out.println(tg.getName());
    }
}