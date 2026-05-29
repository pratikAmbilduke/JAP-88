//WAP to return last  digit

class ReturnLastDigit
{
	int m1(int a)
	{
		int lastDigit= a%10;
		return lastDigit;
	}
}

class MainClass
{
	public static void main(String args[])
	{
		ReturnLastDigit r= new ReturnLastDigit();
		System.out.println(r.m1(43432));
	}	
}