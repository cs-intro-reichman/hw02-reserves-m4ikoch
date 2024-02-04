/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder 
{
	public static void main (String[] args) 
	{
		int x = (int) (10 * Math.random());
		int y = x;
		do {
			y = x;
			System.out.print(y + " ");
			x = (int) (10 * Math.random());
		} while (x >= y);
		System.out.println();
	}
}
