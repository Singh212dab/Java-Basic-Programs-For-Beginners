import java.util.Scanner;
import java.lang.Math.*;
class Dk10
{
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		double num = s.nextDouble();
		System.out.println("Square root of " + num + " : " + Math.sqrt(num));
	}
}