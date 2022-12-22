package lab9;

public class ConstantSensor implements Sensor {
	private int reading;

	public ConstantSensor(int reading) {
		this.reading = reading;
	}

	@Override
	public boolean ison() {
		return true;
	}

	@Override
	public void on() {
		//the sensor is always on
		
	}

	@Override
	public void off() {
		//the sensor is always on
	}

	@Override
	public int measure() {
		return this.reading;
	}

}
