
public class ArithmaticDemo 
{
	public void add()
	{
		int a= 20;
		int b = 10;
		int res = a + b;
		System.out.println("Addition : "+res);
	}
	public void sub()
	{
		int a= 20;
		int b = 10;
		int res = a - b;
		System.out.println("Subtraction : "+res);
	}
	public void mul()
	{
		int a= 20;
		int b = 10;
		int res = a * b;
		System.out.println("Multiplication : "+res);
	}
	public void div()
	{
		int a= 20;
		int b = 10;
		int res = a / b;
		System.out.println("Division : "+res);
	}
	public void per()
	{
		int a = 20;
		int b = 10;
		int c = 30;
		int res = (a + b + c) / 3;
		System.out.println("Percentage : "+res);
	}
	public static void main(String[] args)
	{
		ArithmaticDemo d = new ArithmaticDemo();
		d.add();
		d.sub();
		d.mul();
		d.div();
		d.per();
	}
}
