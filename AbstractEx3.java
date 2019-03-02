//instance block or static in abstract

abstract class AbstractEx3 
{
    AbstractEx3() { System.out.println("Parent class constructor");}

	{ System.out.println("Instance block"); }

	static
		{ System.out.println("Static block"); }
}

class Test extends AbstractEx3
{
	Test() 
			{ super();
		System.out.println("child class constructor"); }

	public static void main(String[] args) 
	{
		Test t=new Test();
	}
}
