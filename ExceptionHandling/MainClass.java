class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

class VotingSystem
{
	void vote(int age) throws InvalidAgeException
	{
		if(age<18)	
		{
			throw new InvalidAgeException("Age must be more than 18");
		}
	}
}

class MainClass
{
	public static void main(String args[])
	{
		VotingSystem v= new VotingSystem();
		try{
			v.vote(15);
		}

		catch(InvalidAgeException e){
			System.out.println("Exception occured: "+ e.getMessage());
		}

		System.out.println("Program Ended");
	}	
}