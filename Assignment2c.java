import java.util.*;

public class ModifiedBubbleSort 
{
	static int[] MBS(int arr[])
	{
		int i , j , temp;
		for(i = 0 ; i < arr.length ; i++)
		{
			int swap = 0;
			for(j = 1 ; j < arr.length ; j++)
			{
				if(arr[j] < arr[j-1])
				{
					swap++;
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			if(swap == 0)
			{
				break;
			}
		}
		
		return arr;
	}
	
	
	static void binarySearch(int arr[] , int a)
	{
		int left = 0;
		int right = arr.length - 1;
		int com = 0;
		while(left <= right)
		{
			com++;
			int mid = (left + right) / 2; 
			if(arr[mid] == a)
			{
				System.out.println(mid);
				System.out.println(com);
				return;
			}
			
			else if(arr[mid] < a)
			{
				left = mid + 1;
			}
			
			else if(arr[mid] > a)
			{
				right = mid - 1;
			}
			
		}
		System.out.println("element not found");
	}
	
	public static void main(String[] args)
	{
		Scanner SC = new Scanner(System.in);
		int i;
		System.out.println("QUE3");
		int noe = SC.nextInt();
		int arr[] = new int[noe];
		
		for(i = 0 ; i < noe ; i++)
		{
			arr[i] = SC.nextInt();
		}
		
		int res[] = MBS(arr);
		int key = SC.nextInt();
		
		binarySearch(res , key);
	}
}
