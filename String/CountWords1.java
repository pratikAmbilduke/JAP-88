class CountWords1
{
	public static void main(String args[])
	{
		String s1= "hello i am java developer";
		int count=1;
		for(int i=0; i<s1.length(); i++)
			if(s1.charAt(i)==' ')
				count++;
		System.out.println(count);
	}
}

/*
input: "hello i am java developer"
output: 5 words
*/