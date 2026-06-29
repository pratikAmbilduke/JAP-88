import java.util.ArrayList;

class ArrayList1
{
	public static void main(String args[])
	{
		ArrayList<String> list= new ArrayList<>();
		
		list.add("java");
		list.add("java");
		list.add(null);

		for(int i=1; i<=100; i++)
		{
			System.out.println(i);
		}
		System.out.println(list);
	}
}