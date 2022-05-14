import java.util.Scanner;
class Vol
{
	double volume(double a)
	{
		return (a*a*a);
	}
	double volume(double l, double b, double h)
	{
		return(l*b*h);
	}
}
class Dk13
{
	public static void main(String args[])
	{
		Vol obj = new Vol();
		Scanner s = new Scanner(System.in);
		double ans = 0;
		System.out.println("VOLUME FUNCTION");
		System.out.println("Enter 1 for Cube");
		System.out.println("Enter 2 for Cuboid");
		System.out.print("Option : ");
		int c = s.nextInt();
		if(c==1)
		{
			System.out.println("Program running for Cube");
			System.out.print("Enter Length of Cube : ");
			double a = s.nextDouble();
			ans = obj.volume(a);
		}
		else if(c==2)
		{
			System.out.println("Program running for Cuboid");
			System.out.print("Enter Length of Cuboid : ");
			double l = s.nextDouble();
			System.out.print("Enter Breadth of Cuboid : ");
			double b = s.nextDouble();
			System.out.print("Enter Height of Cuboid : ");
			double h = s.nextDouble();
			ans = obj.volume(l,b,h);
		}
		else 
			System.out.println("Wrong Choice Entered!!! Program will now terminate");
		
		System.out.println("Volume = " + ans);
	}
}
			