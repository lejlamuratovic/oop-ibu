package lab7;
import java.util.*;

public class TextUserInterface {
	private Scanner reader;
	private Dictionary dictionary;

	public TextUserInterface(Scanner reader, Dictionary dictionary) {
	   this.reader = reader;
	   this.dictionary = dictionary;
	       
	   System.out.println(reader.nextLine());
	   System.out.println("Statements \n \t add - adds a word pair to the dictionary \n \t translate - asks a word and prints its translation \n \t quit - quit the text user interface");
	   }

	public void start() {
	   while (true) {
		   System.out.println("");
	       System.out.print("Statement: ");
	       String command = reader.nextLine();

	       if (command.equals("quit")){
	    	   System.out.println("Cheers");
	           break;
	            } else {
	            	handleCommand(command);
	            }
	        }
	    }
	
	public void handleCommand(String command) {
	       if (command.equals("add")){
	          System.out.print("In Finnish: ");
	          String word = reader.nextLine();
	          System.out.print("Translation: ");
	          String translation = reader.nextLine();
	          add(word, translation);
	        } else if (command.equals("translate")){
	           System.out.print("Give a word: ");
	           String word = reader.nextLine();
	           System.out.println("Translation: " + translate(word));
	        }else{
	            System.out.println("Unknown statement");
	        }
	    }
	    
	    public String translate(String word){
	      return  dictionary.translate(word);
	    }
	    
	    public void add(String word, String translation){
	        dictionary.add(word, translation);
	    }
}