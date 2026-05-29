//WAP to retuen second last digit

class ReturnSecondLastDigit
{
	int returnSecondLastDigit(int a)
	{
		int secondDigit= a%100;
		secondDigit/=10;
		return secondDigit;
	}
	
}

class MainClass
{
	public static void main(String args[])
	{
		ReturnSecondLastDigit r= new ReturnSecondLastDigit();
		System.out.println(r.returnSecondLastDigit(111345));
	}
}