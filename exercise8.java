import java.util.Scanner;
import java.util.Random; 

public class exercise8 {
    public static void main(String[] args) {
        int number = drawNumber();
        int countGuess = 0;

        Scanner reader = new Scanner(System.in); 

        while(true) {
            System.out.println("Guess a number: ");
            int guess = reader.nextInt(); 
            countGuess++;
            if(guess > number) {
            System.out.println("The number is lesser, guesses made " + countGuess);
        } else if(guess < number) {
            System.out.println("The number is greater, guesses made " + countGuess);
        } else {
            System.out.println("Congrats");
            break;
        }
    }
    }

    private static int drawNumber() {
        Random rand = new Random(); 
        int number = rand.nextInt(101);
        return number;
    }
}
