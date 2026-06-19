class Writing implements Runnable
{
	public void bookWriting()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Writing Processing");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}

	public void run()
	{
		bookWriting();
	}
}


class Reading implements Runnable
{
	public void bookReading()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Reading Processing");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}

	public void run()
	{
		bookReading();
	}
}


class Learning implements Runnable
{
	public void bookLearning()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Learning Processing");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}

	public void run()
	{
		bookLearning();
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Writing w = new Writing();
		Reading r = new Reading();
		Learning l =  new Learning();

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(l);

		t1.start();
		t2.start();
		try{
			t1.join(5000);
		}	
		catch(InterruptedException e){
			System.out.println(e);
		}

		t3.start();
	}	
}