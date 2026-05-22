import java.util.Scanner;
class FindingLargestElement
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size of an Array:");
		int size= sc.nextInt();
	
		int arr[]= new int[size];
		
		
		System.out.println("Enter Array Elements:");
		for(int i=0; i<size; i++)
		{
			arr[i]= sc.nextInt();
		}


		int largestno= arr[0];

		System.out.println("Array Elements are:");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");	
		}
	
		System.out.println();
		for(int i=1; i<size; i++)
		{
			if(largestno<arr[i])
			largestno= arr[i];
		}
		System.out.println("Largest Array Elements is:"+largestno);
	}
	
}