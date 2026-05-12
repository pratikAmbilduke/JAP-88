/*
input: hello i am java developer
output: hllmj v dv lpre oiaaaeeoe
*/

class VowellsOfWordsAtLast
{
	public static void main(String args[])
	{
		String s1= "hello i am java developer";
		String s2= s1.toUpperCase();
		StringBuilder vow= new StringBuilder();
		StringBuilder cons= new StringBuilder();
		for(int i=0; i<s1.length(); i++)
		{
			char c= s2.charAt(i);
			if(c== 'A' || c=='E' || c== 'I' || c== 'O' || c=='U')
				vow.append(s1.charAt(i));
			else
				if(c!=' ')
					cons.append(s1.charAt(i));
		}
		cons.append(vow);
		System.out.println(cons);
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)==' ')
				cons.insert(i, ' ');
		}
		System.out.println(cons);
			
	}
}