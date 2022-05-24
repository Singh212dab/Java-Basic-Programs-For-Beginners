abstract class Base
{
	abstract void print();
}
class Derived extends Base
{
	void print()
	{
		System.out.println("");
		System.out.println("**");
		System.out.println("");
		System.out.println("Print Function in Sub Class of Abstract Super Class");
		System.out.println("");
		System.out.println("**");
	}
}
class Dk1
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.print();
	}
}
