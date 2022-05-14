class Vehicle
{
	public void Bike()
	{
		System.out.println("Bike Function");
	}
	public void Car()
	{
		System.out.println("Car Function");
	}
}
class Motor extends Vehicle
{
	public void Func()
	{
		System.out.println("In Motor Class");
		Bike();
		Car();
	}
}
class Cycle extends Vehicle
{
	public void Func()
	{
		System.out.println("In Cycle Class");
		Bike();
		Car();
	}
}
class Dk12
{
	public static void main(String args[])
	{
		Motor m = new Motor();
		m.Func();
		Cycle c = new Cycle();
		c.Func();
	}
}