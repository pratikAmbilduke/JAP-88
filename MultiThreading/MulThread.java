class MulThread extends Thread
{
	public void run()
	{
		System.out.println("Run method called");
	}
}

class MainClass
{
	public static void main(String args[])
	{
		MulThread t= new MulThread();
		t.start();
		System.out.println("Thread ID: "+t.getId());
	}
}