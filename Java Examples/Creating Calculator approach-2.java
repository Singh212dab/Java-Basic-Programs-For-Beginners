package dabblu;

import java.util.Scanner;

public class Calculator
{
	int num1, num2, ans = 0;
	
	public void getVal()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Value 1 : ");
		num1 = s.nextInt();
		System.out.print("Enter Value 2 : ");
		num2 = s.nextInt();
	}
	public int add()
	{
		this.ans = num1 + num2;
		return this.ans;
	}
	public int minus()
	{
		this.ans = num1 - num2;
		return this.ans;
	}
	public int multi()
	{
		this.ans = num1 * num2;
		return this.ans;
	}
	public double div()
	{
		double ans1 = num1 / num2;
		return ans1;
	}
}