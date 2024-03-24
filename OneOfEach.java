
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int count=2;
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
        System.out.print(Gender1 + " ");
        double random2= Math.random();
        if (random2<0.5){
            Gender2 = Double.toString (random2);
            Gender2="g";
        } 
        else{
            Gender2 = Double.toString (random2);
            Gender2="b";
        } 
        System.out.print(Gender2 + " ");
        while (Gender1 == Gender2){
            count++; 
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
            System.out.print(Gender2 + " ");

        }
        System.out.println();
        System.out.println("You made it... and now you have " + count + " children");
    }
	}
