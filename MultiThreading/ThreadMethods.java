class ThreadMethods extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
			System.out.println("Run Method Called: "+getName()+" "+ getId()+"  "+"Thread Priority: "+getPriority());
	}
}

class MainClass
{
	public static void main(String args[])
	{
		ThreadMethods t1= new ThreadMethods();
		ThreadMethods t2= new ThreadMethods();
		t1.setName("Pratik");	
		t2.setName("Golu");
		t1.start();
		t2.start();
		t1.setPriority(10);
	}
}