import java.util.Scanner;
class Dk5
{
	public static void main(String Args[])
	{
		Scanner s = new Scanner (System.in);
		System.out.print("Enter a Number upto 9 : ");
		int num = s.nextInt();
		System.out.println("");
		System.out.println("Enter 1 for using nested-if");
		System.out.println("Enter 2 for using switch-case");
		int choice = s.nextInt();
		System.out.println("");
		System.out.print("Answer = ");
		if(choice == 1)
		{
			if(num == 1)
				System.out.print("ONE");
			else if(num == 2)
				System.out.print("TWO");
			else if(num == 3)
				System.out.print("THREE");
			else if(num == 4)
				System.out.print("FOUR");
			else if(num == 5)
				System.out.print("FIVE");
			else if(num == 6)
				System.out.print("SIX");
			else if(num == 7)
				System.out.print("SEVEN");
			else if(num == 8)
				System.out.print("EIGHT");
			else if(num == 9)
				System.out.print("NINE");
			else
				System.out.print("OTHER");
		}
		else
		{			
			switch(num)
			{
				case 1 : System.out.print("ONE");
						 break;
				case 2 : System.out.print("TWO");
						 break;
				case 3 : System.out.print("THREE");
						 break;
				case 4 : System.out.print("FOUR");
						 break;
				case 5 : System.out.print("FIVE");
						 break;
				case 6 : System.out.print("SIX");
						 break;
				case 7 : System.out.print("SEVEN");
						 break;
				case 8 : System.out.print("EIGHT");
						 break;
				case 9 : System.out.print("NINE");
						 break;
				default : System.out.print("OTHER");
			}
		}
	}
}