/*
	WAP to find largest element from ana array
*/

class Array1
{
	public static void main(String args[])
	{
		int arr[]={11,12,3,4,5,16};
		
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