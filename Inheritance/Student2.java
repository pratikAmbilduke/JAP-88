class Student2 extends Person1
{
	String name= "Golu";
	
	Student2()
	{
		this(99);
		System.out.println("Default constructor of child");
	}

	Student2(int id)
	{
		super();
		System.out.println("Parameterized constructor of Child");
	}

	void Display()
	{
		
		System.out.println(this.name);
		System.out.println(super.name);
		this.message();
		super.show();
	}

	void message()
	{
		System.out.println("Child class Method");
	}
}