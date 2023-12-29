public class TowerOfHanoi 
{
	public static void main(String[] args) 
	{
		towerOfHanoi(3, "Tower 1", "Tower 2", "Tower 3");
    }

    public static void towerOfHanoi(int n, String source, String auxiliary, String destination)
    {
    	if (n > 0) 
        {
    		towerOfHanoi(n - 1, source, destination, auxiliary);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    }
}