class program167
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;
		int count2=n*(n+1)/2;
		for(int i=n; i>=1; i--)
		{
			int c1=count1; //5
			int c2=count2;//15
			for(int j=i; j<n; j++) //1<5
			{
				System.out.print("\t");
			}
			for(int j=i; j<=n; j++)//5<=5
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64));
				System.out.print("\t");
				c1-=j+1;
				c2+=j;
			}
			System.out.println();
			count1+=i1-1;
			count2-=i1-1;
		}
	}
}