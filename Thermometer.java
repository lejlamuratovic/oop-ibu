package lab9;

import java.util.Random;

public class Thermometer implements Sensor {
	private boolean isOn;
	private Random random;

	public Thermometer() {
		this.isOn = false;
		this.random = new Random();
		}

	@Override
	public boolean ison() {
		return isOn;
	}

	@Override
	public void on() {
		this.isOn = true;
		
	}

	@Override
	public void off() {
		this.isOn = false;
	}

	@Override
	public int measure() {
		if (!isOn) {
			throw new IllegalStateException("Cannot measure temperature when thermometer is off");
			}
		    return random.nextInt(61) - 30;
		  }

}
	
