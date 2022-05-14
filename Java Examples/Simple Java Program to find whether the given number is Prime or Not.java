import java.util.Scanner;
class Dk9
{
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		for (int i = 2; i < num; i++)
		{
			if(num%i != 0)
				continue;
			else
			{
				System.out.println("Given Number is not a prime number");
				System.exit(0);
			}
		}
		System.out.println("Given number is a prime number");
	}
}