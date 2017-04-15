public class LargestN
{
	public static void main(String args[])
	{
		int n = 15;
		int a[] = new int[n];
	
		int i;
		int maximum = 0;
		
		for (i=0; i<=n-1; i++)
		{
			a[i] = i + 3;
		}
	
		for (i=0; i<=n-1; i++)
		{
			if (a[i] > maximum) 
			{
				maximum = a[i];
			}
		}

		System.out.println("The maximum of " + n + " numbers is: " + maximum);
	
	}
}