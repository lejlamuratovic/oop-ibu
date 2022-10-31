import java.util.*;

public class exercise6 {
    public static void main(String[] args) {
        //Create a program that asks the user to input words until the user gives the same word twice. 
        //Use an ArrayList structure in your program.

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Enter a word: "); 
            String word = reader.nextLine();
            if(words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            }
            words.add(word); 
        }

        //print all words in alphabetical order

        Collections.sort(words);

        for(String i : words) {
            System.out.println(i);
        }
    }
}
