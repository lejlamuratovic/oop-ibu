package lab7;
import java.util.*;

public class Dictionary {
	private HashMap<String, String> dictionary; 

    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
    	return this.dictionary.get(word);
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translateList = new ArrayList<String>();
        
        for(String i : dictionary.keySet()){
            translateList.add(i + " = " + dictionary.get(i));
        }
        return translateList;
      }

}
