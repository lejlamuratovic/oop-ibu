package lab10.simulator;
import java.util.Random;

public class Cow implements Alive, Milkable {
	private String name;
	private double udderCapacity;
	private double amount;
	
	public Cow() {
		this.name = NAMES[new Random().nextInt(NAMES.length)];
		this.udderCapacity = 15 + new Random().nextInt(26);
		this.amount = 0;    
	}
	
	public Cow(String name) {
	    this.name = name;
	    this.udderCapacity = 15 + new Random().nextInt(26);
	    this.amount = 0;
	}
	
	public String getName() {
	    return this.name;
	}

	public double getCapacity() {
	    return this.udderCapacity;
	}

	public double getAmount() {
	    return this.amount;
	}
	
	@Override
	public double milk() {
		double all = this.amount;
	    this.amount = 0;
	    return all;
	}

	@Override
	public void liveHour() {
		this.amount += 0.7 + new Random().nextInt(2);
	    if (this.amount > this.udderCapacity) {
	      this.amount = this.udderCapacity;
	    }
	}
	
	 @Override
	 public String toString() {
		 return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapacity);
	 }
	
	private static final String[] NAMES = new String[]{
			"Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  
			"Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", 
			"Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
			};
}
