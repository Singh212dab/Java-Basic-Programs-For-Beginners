import java.util.Scanner;
interface one
{
	public void getName();
	public void getMarks();
}
interface two
{
	public void printName();
	public void printMarks();
}
class Multi implements one, two
{
	String name;
	int marks;
	Scanner s = new Scanner(System.in);
	public void getName()
	{		
		System.out.print("Enter Name of Student : ");
		this.name = s.nextLine();
	}
	public void getMarks()
	{
		System.out.print("Enter Marks of Student : ");
		this.marks = s.nextInt();
	}
	public void printName()
	{
		System.out.println("");
		System.out.println("Name : " + this.name);
	}
	public void printMarks()
	{
		System.out.println("Marks : " + this.marks);
	}
}
class Dk16
{
	public static void main(String args[])
	{
		Multi m = new Multi();
		m.getName();
		m.getMarks();
		m.printName();
		m.printMarks();
	}
}