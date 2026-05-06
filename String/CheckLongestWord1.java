class CheckLongestWord1
{
	public static void main(String args[])
	{
		String s1= "welcome to aaaaaaaaaaaaa international airport";
		String s2[]= s1.split(" ");
		String max= max= s2[0];
		for(int i=1; i<s2.length; i++)
		{
			if(max.length()<s2[i].length())
				max=s2[i];
		}
		System.out.println(max);
	}
}

/*
input: welcome to international airport
output: aaaaaaaaaaaaa
*/	