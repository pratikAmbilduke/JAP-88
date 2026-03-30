class program133
{
	public static void main(String args[])
	{
		int n=5;
		int count=n; //5
		for(int i=n; i>=1; i--) //5>=1
		{
			int c=count;
			for(int j=i; j>=1; j--) //5>=1
			{
				System.out.print((char)(c+64)); //E
				c--;
			}
			System.out.println();
			count+=i-1;
		}
	}
}