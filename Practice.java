class Practice
{
	void m1()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Practice p= new Practice();
		p.m1();
		p.m1();
		p.m1();
	}
}