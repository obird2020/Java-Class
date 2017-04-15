public class ReverseString
{
	public static void main(String args[])
	{
		char A[] = new char[5];
		char B[] = new char[5];
		A[0] = 'A';
		A[1] = 'L';
		A[2] = 'O';
		A[3] = 'B';
		A[4] = 'E';
		
		int i;
		for (i=0; i<=A.length-1; i++)
		{
			B[i] = A[A.length-1-i];
		}
		
		System.out.print("Original String:A=");
		for (i=0; i<=A.length-1; i++)
		{
			if (i == A.length-1)
				System.out.println(A[i]);
			else
				System.out.print(A[i]);
		}

		System.out.print("Reverse String:B=");
		for (i=0; i<=B.length-1; i++)
		{
			if (i == B.length-1)
				System.out.println(B[i]);
			else
				System.out.print(B[i]);
		}
	}

}