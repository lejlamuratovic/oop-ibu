package lab8;
import java.util.*;

public class Box {
	private ArrayList<ToBeStored> things;
	private double maximumWeight;
	
	public Box(double maxWeight) {
		this.things = new ArrayList<ToBeStored>();
		this.maximumWeight = maxWeight;
	}
	
	public void add(ToBeStored thing) {
		if((this.totalWeight() + thing.weight()) > this.maximumWeight) {
			System.out.println("Full");
		} else {
			this.things.add(thing);
		}
	}
	
	public double totalWeight() {
		double total = 0;
		
		for(ToBeStored toBeStored : things) {
			total += toBeStored.weight();
		}
		
		return total;
	}
	
	public String toString() {
		return "Number of things " + this.things.size() + ", total weight: " + this.totalWeight();
	}

}
