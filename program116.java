class program116
{
	public static void main(String args[])
	{
		int n=5;
		int count=((n*(n-1))/2)+1; //13
		for(int i=n; i>=1; i--) //3>=1
		{
			int c=count; //c=13-5=8
			for(int j=n; j>=i; j--) //4>=3
			{
				System.out.print(c+"\t"); //
				c-=j;
			}
			System.out.println();
			count++;
		}
	}
}

/*
11
12	7
13	8	4
14	9	5	2
15	10	6	3	1
*/