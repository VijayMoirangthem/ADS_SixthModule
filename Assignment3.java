import java.util.*;

public class Assignment3 
{
	static int startpt = 0 , result = 0;
	static boolean checkFirstAndLast(String str)
	{
		if(str.charAt(0) == str.charAt(str.length() - 1))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	

	 static void calSubString(String str) 
	 {
		 int i;
		 if(startpt > str.length()) //checks if start pt is greater than str.length
		 {
			 System.out.println(result);
			 return;
		 }
		 for(i = startpt + 1 ; i <= str.length() ; i++)   //calculate substrings from start pt to str.length
		 {
			 if(checkFirstAndLast(str.substring(startpt , i)))
			 {
				 result++;
			 }
		 }
		 startpt++;  //shift start pt to right by 1
		 calSubString(str);  //
	 }
	
	public static void main(String[] args)
	{
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter String");
		String str = SC.next();
		calSubString(str);
	}
}
