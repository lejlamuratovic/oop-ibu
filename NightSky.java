package week6;
import java.util.*; 

public class NightSky {
	private double density; 
	private int width; 
	private int height;
	private Random random = new Random();
	private int starsInLastPrint;

	public NightSky(double density) {
		this.density = density;
		this.width = 20; 
		this.height = 10;
	}
	
	public NightSky(int width, int height) {
		this.density = 0.1; 
		this.width = width; 
		this.height = height;
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width; 
		this.height = height;
	}
	
	public void printLine() {
		for(int i = 0; i < this.width; i++) {
			double probability = this.random.nextDouble();
			if(probability <= this.density) {
				System.out.print("*");
				this.starsInLastPrint += 1;
			} else {
				System.out.print(" ");
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < height; i++) {
			printLine();
			System.out.println("");
		}
	}
	
	public int starsInLastPrint() {
		int currentNumber = this.starsInLastPrint;
		this.starsInLastPrint = 0;
		return currentNumber;
	}
	
}
