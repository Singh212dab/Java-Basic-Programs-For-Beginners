import java.util.Scanner;
class Square
{
	int num1;
	void area()
	{
		System.out.println("Area of Square : " + (num1 * num1));
	}
	Square(int x)
	{
		num1 = x;
		area();
	}
}
class Dk19
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("AREA CALCULATE");
		System.out.println("");
		System.out.print("Enter Length of Square : ");
		Square sq = new Square(s.nextInt());
	}
}