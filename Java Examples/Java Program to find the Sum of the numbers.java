import java.util.Scanner;
class Dk7
{
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements your want to enter : ");
		int n = s.nextInt();
		int sum = 0;
		int array[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the value of element " + (i+1) + " : ");
			array[i] = s.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			sum += array[i];
		}
		System.out.println("");
		System.out.println("Sum of Elements = " + sum);
	}
}