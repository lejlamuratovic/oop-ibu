package lab7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//exercise 1 
		HashMap<String, String> names = new HashMap<String, String>();
		names.put("matti", "mage");
		names.put("mikael", "mixu");
		names.put("arto", "arppa");
		
		String mikaelNickname = names.get("mikael");
		System.out.println(mikaelNickname);
		
		//exercise 2
		PromissoryNote mattisNote = new PromissoryNote();
		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Arto", 10.5);
		 
		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
		
		//exercise 3
//		Dictionary dictionary = new Dictionary();
//	    dictionary.add("apina", "monkey");
//	    dictionary.add("banaani", "banana");
//	    dictionary.add("cembalo", "harpsichord");
//	 
//	    System.out.println(dictionary.translate("apina"));
//	    System.out.println(dictionary.translate("porkkana"));
//	    
//	    Dictionary dictionary = new Dictionary();
//	    dictionary.add("apina", "monkey");
//	    dictionary.add("banaani", "banana");
//	    System.out.println(dictionary.amountOfWords());
//	  
//	    dictionary.add("cembalo", "harpsichord");
//	    System.out.println(dictionary.amountOfWords());
		
//		Dictionary dictionary = new Dictionary();
//	    dictionary.add("apina", "monkey");
//	    dictionary.add("banaani", "banana");
//	    dictionary.add("cembalo", "harpsichord");
//	 
//	    ArrayList<String> translations = dictionary.translationList();
//	    for(String translation: translations) {
//	        System.out.println(translation);
//	    }
	
		Scanner reader = new Scanner(System.in);
		Dictionary dictionary = new Dictionary();
    
		TextUserInterface ui = new TextUserInterface(reader, dictionary);
    	ui.start();
	}

}
