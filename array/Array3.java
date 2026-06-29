/*
	WAP to find smallest element from an array
*/

class Array3
{
	public static void main(String args[])
	{
		int arr[]={11,12,3,4,5,16,0,-1};
		
		int min= arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
		}	
		System.out.println(min);	
	}
}