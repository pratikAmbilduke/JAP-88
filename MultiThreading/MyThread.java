class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Run Method called");
	}
}
	
class MainClass
{
	public static void main(String args[])
	{
		MyThread t= new MyThread();
		t.start();
	}
}