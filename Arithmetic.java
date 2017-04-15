public class Arithmetic
{

	public static void main(String args[])
	{
		int sum,diff,prod,quotient;

		sum = add(3,4);
		diff = sub(10,8);
		prod = mul(6,5);
		quotient = div(20,4);

		System.out.println("Sum of 3 and 4 is: " + sum);
		System.out.println("Difference of 10 and 8 is: " + diff);
		System.out.println("Product of 6 and 5 is: " + prod);
		System.out.println("Quotient of 20 and 4 is: " + quotient);
	}

	public static int add(int a, int b)
	{
		return a + b;
	}

	public static int sub(int a, int b)
	{
		return a - b;
	}

	public static int mul(int a, int b)
	{
		return a * b;
	}

	public static int div(int a, int b)
	{
		return a / b;
	}

}