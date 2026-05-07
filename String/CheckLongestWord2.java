class CheckLongestWord2
{
	public static void main(String args[])
	{
		String s1= "welcome to aaaaaaaaaaaaa international airport";
		String s2[]= s1.split(" ");
		int max= 0;
		for (int i=0; i<s2.length; i++)
		{
			String temp= s2[i];
			if(max<temp.length())
				max= temp.length();
		}
		for(int i=0; i<s2.length; i++)
		{
			String temp = s2[i];
			if(max==temp.length())
				System.out.println(temp);
		}
	
	}
}

/*
input: welcome to international airport
output: aaaaaaaaaaaaa international
*/