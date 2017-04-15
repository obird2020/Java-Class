public class ExceptionHandling
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 5;
		int c = 5;
		int x,y;

		try
		{
			x = a / (b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error here...division by 0" );
			a = 20;
			b = 7;
			x = a / (b-c);
			System.out.println("Now valid.. " + x);
		}
	}
	
}