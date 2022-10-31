import java.util.Scanner; 

public class exercise5 {
    public static void main(String[] args) {
        //Create a program that asks the user for two words. Then the program tells if the second word is included in the first word. 
        //Use the String method indexOf in your program.
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String first = reader.nextLine();

        System.out.print("Type the second word: ");
        String second = reader.nextLine();

        if(first.indexOf(second) == -1) {
            System.out.print("The word does not contain " + second);
        } else {
            System.out.print("The word contains " + second);
        }
    }
}
