class Program2
{
	void length()
	{
		try{
		String str= null;
		System.out.println(str.length());
		}

		catch(NullPointerException e){
			System.out.println(e +"String cannot be null");
		}
		
		catch(ArithmeticException e){
			System.out.println(e +"Number Related Error");
		}

		catch(Exception e){
			System.out.println(e +"Generic error");
		}

	}	
}

class MainClass
{
	public static void main(String args[])
	{
		Program2 p= new Program2();
		p.length();
	}
}