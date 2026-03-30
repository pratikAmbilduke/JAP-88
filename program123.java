class program123
{
	public static void main(String args[])
	{
		int n=5;
		int count=1; //15
		for(int i=1; i<=n; i++) //1<=5
		{
			int c=count; //15
			for(int j=n; j>=1;j--) //1>=1
			{
				System.out.print((char)(c+64)); //O
								  
				c+=j;
			}
			System.out.println();
			count++;

		}
	}
}

/*
A
BC
DEF
GHIJ
KLMNO
*/