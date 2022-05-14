import java.util.Scanner;
class Dk6
{
    public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
        int n, t1 = 0, t2 = 1;
		System.out.print("Enter the number of terms you want to print : ");
		n = s.nextInt();
        System.out.println("First " + n + " terms: ");
		System.out.println("");
        for (int i = 1; i <= n; ++i)
        {
            System.out.println(""+t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}