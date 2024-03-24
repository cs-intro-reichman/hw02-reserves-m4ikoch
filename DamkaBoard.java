/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int number= Integer.parseInt(args[0]); //3
        int count=number; //count=4
        while (count>0){ // 4>0
            for (int j=0; j<number; j++){ // 0<4, 1<4, 2<4, 3<4
            System.out.print("* ");
            }
            System.out.println(); 
            if (count!=1)
            {
                for (int i=0 ; i <number; i++){ // 0<4, 1<4, 2<4, 3<4
            System.out.print(" " +"*");
            }
            System.out.println();
            }    
            
            count=count-2;//count= 4-2, count=2
        }	}
}