/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int random1= (int) (Math.random()*10);
		System.out.println(random1);
		//first random
		int random2= (int) (Math.random()*10);
		//second random
		while (random1<=random2){
			System.out.println(random2);
			random1=random2;
			random2= (int) (Math.random()*10);
		}	
	}
}