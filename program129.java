class program129
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;//(n*(n-1)/2)+1;
		int count2=n*(n+1/2);
		for(int i=1; i<=n; i++)
		{
	
			int c1=count1;
			//int c2=count2;
			for(int j=i; j<n; j++)
			{
				System.out.print("\t");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print((char)(c1+64));
				//System.out.print((char)(c2+64));
				System.out.print("\t");
				c1-=j-1;
				//c2
			}
			System.out.println();
			count1+=i;
		}
	}
}