<<<<<<< HEAD
class program202
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
				for(int j=1; j<=(n-i)+1; j++)
					System.out.print(j);
			else
				for(int j=1; j<=(i-n)+1; j++)
					System.out.print(j);
				System.out.println();
		}
	}
=======
class program202
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
				for(int j=1; j<=(n-i)+1; j++)
					System.out.print(j);
			else
				for(int j=1; j<=(i-n)+1; j++)
					System.out.print(j);
				System.out.println();
		}
	}
>>>>>>> d6a02c659e8a2dc97c131e064c7d072b6c8997c3
}