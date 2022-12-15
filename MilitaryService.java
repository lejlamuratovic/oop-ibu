package lab8;

public class MilitaryService implements NationalService{
	int daysLeft; 
	
	public MilitaryService(int daysLeft) {
		this.daysLeft = daysLeft; 
	}

	@Override
	public int getDaysLeft() {
		return this.daysLeft;
	}

	@Override
	public void work() {
		this.daysLeft--;
		
	}

}
