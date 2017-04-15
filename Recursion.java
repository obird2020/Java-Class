public class Recursion
{
	public static void main(String args[])
	{
		int fac;
		fac = 1;
		int facval;
		int n = 5;
		facval = factorial(n);

		System.out.println("Factorial of " + n + " is: " + facval);
	}

	
	public static int factorial(int n)
	{
		if (n == 1) 
			return 1;
		return n * factorial(n - 1);
	}
	
}