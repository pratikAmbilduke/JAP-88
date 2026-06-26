import java.util.*;	

class ListMethod
{
	public static void main(String args[])
	{
		List<String> list= new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("java");
		list.add(1,"Modi");

		System.out.println(list);
	}
}