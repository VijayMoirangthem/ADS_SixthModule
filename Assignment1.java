import java.util.*;

public class HappyNumbers
{
	public static int sumOfSquares(int n) 
	{
		int sum = 0;
		int x;
		while(n != 0) 
		{
			x = n%10;
			sum = sum + (x * x);
			n = n / 10;
		}
		return sum;
	}
	
	
	public static int isHappy(int a) 
	{
		int counter = 0 , i;
		
		for(i = 1 ; i <= 10 ; i++)
		{
			a = sumOfSquares(a);
			counter++;
			if(a == 1) 
			{
				break;
			}
		}
		
		if(a == 1)
		{
			return counter+1;
		}
		
		else 
		{
			return -1;
		}
		
	}
	
	
	public static void happyRange(int start , int end) 
	{
		int i;
		for(i = start ; i <= end ; i++) 
		{
			int x = isHappy(i);
			if(x != -1) 
			{
				System.out.println(i + " " + x);
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers");
		Scanner SC = new Scanner(System.in);
		int start = SC.nextInt();
		int end = SC.nextInt();
		System.out.println("");
		happyRange(start , end);
	}
}
