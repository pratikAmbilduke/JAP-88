<<<<<<< HEAD
class program200
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
				for(int j=i; j<=n; j++)
					System.out.print((n-i)+1);
			else
				for(int j=i; j>=n; j--)
					System.out.print((i-n)+1);
				System.out.println();

		}
	}
=======
class program200
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=(n*2)-1; i++)
		{
			if(i<=n)
				for(int j=i; j<=n; j++)
					System.out.print((n-i)+1);
			else
				for(int j=i; j>=n; j--)
					System.out.print((i-n)+1);
				System.out.println();

		}
	}
>>>>>>> d6a02c659e8a2dc97c131e064c7d072b6c8997c3
}