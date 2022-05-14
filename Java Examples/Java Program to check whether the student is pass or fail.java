import java.util.Scanner;
class Dk2
{
	public static void main(String Args[])
	{	
		Scanner S = new Scanner(System.in);
		String name;
		int mark;
		System.out.print("Enter Name of Student : ");
                name = S.nextLine();
		System.out.print("Enter mark of the Student : ");
		mark = S.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("Result");
		System.out.println("");
		System.out.println("Name of Student : "+name);
		if (mark>=50)
			System.out.println("Result : PASS");
		else
			System.out.println("Result : FAIL");
	}
}