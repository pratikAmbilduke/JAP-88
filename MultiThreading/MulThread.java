class MulThread extends Thread
{
	public void run()
	{
		System.out.println("Run method called");
		System.out.println("Thread Name: "+getName());

	}
}

class MainClass
{
	public static void main(String args[])
	{
		MulThread t= new MulThread();
		MulThread t1= new MulThread();
		t.start();
		t1.start();
		System.out.println("Thread ID: "+t.getId());
	}
}