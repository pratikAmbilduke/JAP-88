class ParentGroup
{
	public static void main(String args[])
	{
		Thread t= Thread.currentThread();
		ThreadGroup tg= t.getThreadGroup();
		
		System.out.println("Current Thread: "+tg.getName());
		System.out.println("Parent Group: "+tg.getParent().getName());
	}
}