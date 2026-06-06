class AppendSumAtLast
{
	int appendSum(int n)
	{
		int sum=0;
		int temp=n;
		while(temp>0)
		{
			sum+=temp%10;
			temp/=10;	
		}

		if(sum>=100)
			n*=1000;
		else if(sum>=10)
			n*=100;
		     else
			n*=10;
		return n+sum;
			
	}
	
}

class MainClass
{
	public static void main(String args[])
	{
		AppendSumAtLast a= new AppendSumAtLast();
		System.out.println(a.appendSum(1235));
	}
}