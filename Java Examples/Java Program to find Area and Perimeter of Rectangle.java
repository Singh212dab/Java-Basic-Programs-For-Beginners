import java.util.Scanner;
class Base
{
	int l,b;
	void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Length of Rectange : ");
		this.l = s.nextInt();
		System.out.print("Enter Breadth of Rectange : ");
		this.b = s.nextInt();
	}
}
class Rect extends Base
{
	int area()
	{
		int ans = super.l * super.b;
		return ans;
	}
	int perimeter()
	{
		int ans = 2*(super.l + super.b);
		return ans;
	}
}
class Dk14
{
	public static void main(String args[])
	{
		Rect r = new Rect();
		r.getData();
		int area = r.area();
		int perimeter = r.perimeter();
		System.out.println("Area of Rectangle = " + area);
		System.out.println("Perimeter of Rectangle = " + perimeter);
	}
}