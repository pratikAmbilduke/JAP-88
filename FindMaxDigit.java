class FindMaxDigit
{
	int maxDigit(int n)
	{
		int max=0;
		while(n>0)
		{
			int last= n%10;
			if(last>max)
			{
				max= last;
			}
			n/=10;
		}
		return max;
	}
}

class MainClass
{
	public static void main(String args[])
	{
		FindMaxDigit f= new FindMaxDigit();
		System.out.println("MAximum Digit from given number:"+f.maxDigit(123478));
	}
}