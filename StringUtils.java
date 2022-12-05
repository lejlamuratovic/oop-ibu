package week6;

public class StringUtils {
	public static boolean included(String word, String searched) {
		word = word.trim();
		searched = searched.trim();
		
		word = word.toUpperCase(); 
		searched = searched.toUpperCase();
		
		if(word.contains(searched)) {
			return true;
		}  
		
		return false; 
	}
}
