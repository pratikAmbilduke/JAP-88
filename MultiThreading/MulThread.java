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
		t.setName("Pratik Thread");
		t.start();
		t1.setName("Golu Thread");
		t1.start();
		System.out.println("Thread ID: "+t.getId());
		System.out.println("Thread ID: "+t1.getId());
		
	}
}