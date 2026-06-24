class Multiple
{
	public static void main(String args[])
	{
		ThreadGroup tg1= new ThreadGroup("Group1");
		ThreadGroup tg2= new ThreadGroup(tg1,"Group2");
		ThreadGroup tg3= new ThreadGroup(tg2,"Group3");	

		System.out.println(tg3.getParent().getName());
		System.out.println(tg3.getParent().getParent().getName());

	}
}