class program166
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;
		int count2=n*(n+1)/2;
		for(int i=1,i1=n; i<=n || i1>=1; i++, i1--)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i; j<n; j++)
			{
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1-=j;
				c2+=i1;
			}
			System.out.println();
			count1+=i1-1;
			count2-=i1;
		}
	}
}