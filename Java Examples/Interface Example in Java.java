interface A
{
	interface B
	{
		void print();
	}
}
class C1 implements A
{
	void print()
	{
		System.out.println("PRINT FUNCTION");
	}
}
class Dk11
{
	public static void main(String args[])
	{
		C1 c = new C1();
		c.print();
	}
}