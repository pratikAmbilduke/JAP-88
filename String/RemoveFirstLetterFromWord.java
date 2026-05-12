/*
input: hello i am java developer
output: ello m ava eveloper
*/

class RemoveFirstLetterFromWord
{
	public static void main(String args[])
	{
		String s1= "hello i am java developer";
		String s2[]= s1.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<s2.length; i++)
		{
			sb.append(s2[i].substring(1));
				if(i<s2.length-1)
					sb.append(" ");
		}
		System.out.println(sb);
	}
}
