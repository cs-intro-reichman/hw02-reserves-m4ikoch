/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String Word = args[0];
		String NewWord = "";
        for (int i=Word.length()-1; i>=0; i--){
            System.out.print(Word.charAt(i));
			NewWord = NewWord + Word.charAt(i);
        }
        System.out.println();
        int x= NewWord.length();
        System.out.println("The middle character is " + NewWord.charAt((x/2)));
	}
}