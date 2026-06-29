/*
	WAP to find largest element from ana array
*/

class Array2
{
	public static void main(String args[])
	{
		int arr[]={-4, -8, -1};
		
		int max= arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}	
		System.out.println(max);	
	}
}