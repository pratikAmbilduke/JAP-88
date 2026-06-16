class Program3
{
	void compare()
	{
		try{
			int age=20;
			if(age<19)
				throw new Exception("Age should be 18+");
		}

		catch(Exception e) {
   		 		System.out.println(e.getMessage());
		}
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Program3 p= new Program3();
		p.compare();
	}
}