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
		list.set(1, "javaScript");
		list.remove(2);

		System.out.println(list);
		System.out.println(list.get(1));
		String num= list.get(2);
		System.out.println(num);
	}
}