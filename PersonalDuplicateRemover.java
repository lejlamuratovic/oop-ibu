package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
	private Set<String> characterStrings;
	private int duplicateCount;

	public PersonalDuplicateRemover() {
		this.characterStrings = new HashSet<>();
	    this.duplicateCount = 0;
	}

	@Override
	public void add(String characterString) {
		if (!characterStrings.contains(characterString)) {
		    characterStrings.add(characterString);
		  } else {
		    this.duplicateCount++;
		  }
	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		return this.duplicateCount;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		return new HashSet<>(characterStrings);
	}

	@Override
	public void empty() {
		this.characterStrings.clear();
	    this.duplicateCount = 0;
	}

}

