class String3
{
	public static void main(String args[])
	{
		String s1= "India";
		StringBuilder sb= new StringBuilder(s1);
		sb.append(sb.charAt(0));
		sb.delete.charAt(0);
		System.out.println(sb);
	}
}

/*
input: India
output: ndiaI
*/
		