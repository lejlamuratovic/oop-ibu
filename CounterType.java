package week6;

public class CounterType {
	private int count;
	
	public CounterType() {
		this.count = 0;
	}
	
	public void setCount(int count) {
		this.count = count; 
	}
	
	public void increase() {
		this.count++;
	}
	
	public void decrease() {
		if(this.count > 0) {
			this.count--;
		}
	}
	
	public int getCount() {
		return this.count;
	}
	
	public String toString() {
		return "The count is: " + this.count;
	}

}
