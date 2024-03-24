/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double couples = Double.parseDouble(args[0]);
		int childrenCount = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourPlus = 0;
	for (int i = 0 ; i < couples ; i++){
		int localCount = 2;
		String Gender1;
		String Gender2;
		double random1= Math.random(); //getting a number between 0 to 1 
			if (random1<0.5){
				Gender1 = Double.toString (random1);
				Gender1="g";
			} 
			else{
				Gender1 = Double.toString (random1);
				Gender1="b";
			} 
			// System.out.print(Gender1 + " ");
			double random2= Math.random();
			if (random2<0.5){
				Gender2 = Double.toString (random2);
				Gender2="g";
			} 
			else{
				Gender2 = Double.toString (random2);
				Gender2="b";
			} 
			childrenCount = childrenCount + 2;
			// System.out.print(Gender2 + " ");
			while (Gender1 == Gender2){
				childrenCount++; 
				localCount++;
				Gender1=Gender2;
				random2= Math.random();
				if (random2<0.5){
					Gender2 = Double.toString (random2);
					Gender2="g";
				} 
				else{
					Gender2 = Double.toString (random2);
					Gender2="b";
				} 
				// System.out.print(Gender2 + " ");
			}
			if (localCount == 2 ){
				twoChildren++;
			}
			if ( localCount == 3 ){
				threeChildren++;
			}
			if (localCount >= 4){
				fourPlus++;
			}
		}
			System.out.println();
			System.out.println("Average:" + childrenCount/couples + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + twoChildren);
			System.out.println("Number of families with 3 children: " + threeChildren);
			System.out.println("Number of families with 4 or more children: " + fourPlus);
			if (twoChildren > threeChildren && twoChildren > fourPlus){
				System.out.println("The most common number of children is 2." );
	
			}
			if (threeChildren > twoChildren && threeChildren > fourPlus){
				System.out.println("The most common number of children is 3." );
	
			}
			if (fourPlus > twoChildren && fourPlus > threeChildren){
				System.out.println("The most common number of children is 4 or more." );
	
			}
   }
}