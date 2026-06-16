class Program1
{
	int divide(int a, int b)
	{
		System.out.println("Program Started");
		try{
		return a/b;
		}

		catch(ArithmeticException e){
			System.out.println(e);
		return 0;	
		}
		
		finally{
			System.out.println("Finally Block Exexuted");
		}

	}
	
}

class MainClass
{
	public static void main(String args[])
	{
		Program1 p= new Program1();
		System.out.println(p.divide(10,10));
	}
}