import java.util.ArrayList;

class NonGeneric
{
	public static void main(String args[])
	{
		ArrayList list= new ArrayList();
	
		list.add("java");
		list.add(20);
		list.add(20.10);
		list.add(true);

		System.out.println(list);
	}
}