class HybridInheritance
{
	public static void main(String args[])
	{
		Teacher t= new Teacher();
		t.showName();
		t.teach();

		Student s1= new Student();
		s1.showName();
		s1.study();
	}
}