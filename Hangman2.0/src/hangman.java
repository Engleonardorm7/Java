import java.util.Scanner;

public class hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);
		        String word = "hangman";
		        char[] hiddenWord = new char[word.length()];
		        for (int i = 0; i < hiddenWord.length; i++) {
		            hiddenWord[i] = '_';
		        }
		        int remainingAttempts = 6;
		        while (remainingAttempts > 0) {
		            System.out.println("Adivina la palabra: " + new String(hiddenWord));
		            System.out.println("Tienes " + remainingAttempts + " intentos");
		            System.out.print("Introduce una letra: ");
		            char letter = sc.next().charAt(0);
		            boolean correctGuess = false;
		            for (int i = 0; i < word.length(); i++) {
		                if (word.charAt(i) == letter) {
		                    hiddenWord[i] = letter;
		                    correctGuess = true;
		                }
		            }
		            if (!correctGuess) {
		                remainingAttempts--;
		            }
		            if (!new String(hiddenWord).contains("_")) {
		                System.out.println("Felicidades, has adivinado la palabra: " + new String(hiddenWord));
		                break;
		            }
		        }
		        if (remainingAttempts == 0) {
		            System.out.println("Lo siento, has perdido. La palabra era " + word);
		        }
		    }
		
		
		
		
	

}
