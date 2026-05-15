class MethodOverriding
{
	public static void main(String args[])
	{
		Bank b= new Bank();
		b.rateOfInterest();

		Sbi s= new Sbi();
		s.rateOfInterest();
		
		Hdfc h= new Hdfc();
		h.rateOfInterest();
	}
}