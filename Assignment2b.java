public class QuickSort 
{
	static int partition(int arr[] , int start ,int end)
	{
		int pivot = arr[end];
		int i = start - 1 , j;
		
		for(j = start ; j <= end - 1 ; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return (i+1);
	}
	
	
	static void quickSort(int arr[] , int start ,int end)
	{
		if(start < end)
		{
			int p = partition(arr , start , end);
			quickSort(arr , start , p - 1);
			quickSort(arr , p + 1 , end);
		}
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = { 13, 18, 27, 2, 19, 25 };  
		quickSort(arr , 0 , arr.length - 1);
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
