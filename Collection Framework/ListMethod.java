import java.util.*;	

class ListMethod
{
	public static void main(String args[])
	{
		List<String> list= new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("c++");
		list.add(1,"Modi");
		list.add("Modi");

		System.out.println(list);	
		System.out.println(list.indexOf("java"));
		System.out.println(list.lastIndexOf("Modi"));
		System.out.println(list.contains("Modi"));
		System.out.println("Size of an List:"+list.size());
	}
}