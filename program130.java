class program130
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n+(n+1)/2;
		for(int i=1; i<=n; i++)
		{
			int c1=count1;
			for(int j=i; j<n; j++)
			{
				System.out.print("\t");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c1+64));
				c1-=j;
			}
			System.out.println();
			count1-=i;
		}
	}
}