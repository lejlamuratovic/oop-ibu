package lab10.simulator;

public class BulkTank {
	private double capacity;
	private double volume;

	public BulkTank() {
		this.capacity = 2000;
	    this.volume = 0;
	}

	public BulkTank(double capacity) {
	    this.capacity = capacity;
	    this.volume = 0;
	}

	public double getCapacity() {
	    return this.capacity;
	}

	public double getVolume() {
	    return this.volume;
	}
	
	public double howMuchFreeSpace() {
	    return this.capacity - this.volume;
	}

	public void addToTank(double amount) {
		if (amount > this.howMuchFreeSpace()) {
			this.volume = this.capacity;
	    } else {
	      this.volume += amount;
	    }
	  }
	
	public double getFromTank(double amount) {
		if (amount > this.volume) {
	      double all = this.volume;
	      volume = 0;
	      return all;
	      }
		
		volume -= amount;
	    return amount;
	  }

	  public String toString() {
	    return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
	  }
}
