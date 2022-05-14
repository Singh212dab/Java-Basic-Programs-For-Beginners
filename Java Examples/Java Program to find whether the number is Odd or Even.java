import java.util.Scanner;
class Dk4
{
	public static void main(String Args[])
	{
		System.out.print("Enter a Number : ");
		Scanner S = new Scanner(System.in);
		int num = S.nextInt();
		if ((num%2)==0)
			System.out.println("Entered Number is an Even Number");
		else
			System.out.println("Entered Number is an Odd Number");
	}
}