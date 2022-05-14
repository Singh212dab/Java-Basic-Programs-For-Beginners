import dabblu.Calculator;
import java.util.Scanner;

class Dk17
{
	public static void main(String args[])
	{
		Calculator c = new Calculator();
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("CALCULATOR PROGRAMME");
		System.out.println("");
		c.getVal();
		System.out.println("");
		System.out.println("Enter 1 to Perform Addition");
		System.out.println("Enter 2 to Perform Subtraction");
		System.out.println("Enter 3 to Perform Multiplication");
		System.out.println("Enter 4 to Perform Division");
		System.out.println("");
		System.out.print("Choice : ");
		int choice = s.nextInt();
		switch(choice)
		{			
			case 1 : System.out.println("Result : " + c.add());
					 break;
			case 2 : System.out.println("Result : " + c.minus());
					 break;
			case 3 : System.out.println("Result : " + c.multi());
					 break;
			case 4 : System.out.println("Result : " + c.div());
					 break;
			default : System.out.println("Wrong Choice Entered !!!");
		}
	}
}
		