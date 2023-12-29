public class SelSort
{
	static void selectionSort(int arr[])
	{
		int i , j;
		for(i = 0 ; i < arr.length ; i++)
		{
			int index = i;
			for(j = i + 1 ; j < arr.length ; j++)
			{
				if(arr[j] < arr[index])
				{
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		
		for(i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		int [] array =  {90,23,5,109,12,22,67,34};
		selectionSort(array);
	}
	
}
