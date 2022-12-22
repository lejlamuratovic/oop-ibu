package lab9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
	private Map<String, Set<String>> dictionary;

	public PersonalMultipleEntryDictionary() {
		this.dictionary = new HashMap<>();
	}

	@Override
	public void add(String word, String translation) {
		Set<String> translations = this.dictionary.get(word);
	    if (translations == null) {
	      translations = new HashSet<>();
	      this.dictionary.put(word, translations);
	    }
	    translations.add(translation);
	}

	@Override
	public Set<String> translate(String word) {
		Set<String> translations = this.dictionary.get(word);
		if(translations != null) {
			return translations;
		} else {
			return null;
		}
	}

	@Override
	public void remove(String word) {
		 this.dictionary.remove(word);
	}

}
