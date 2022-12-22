package lab9;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	private List<Sensor> sensors;
	private boolean isOn;
	private List<Integer> readings;
	
	public AverageSensor() {
		this.sensors = new ArrayList<>();
		this.isOn = false;
		this.readings = new ArrayList<>();
		}

	public void addSensor(Sensor additional) {
		sensors.add(additional);
		}

	@Override
	public boolean ison() {
		return isOn;
		}
	
	@Override
	public void on() {
		this.isOn = true;
	    for (Sensor sensor : sensors) {
	      if (!sensor.ison()) {
	        sensor.on();
	        }
	      }
	    }

	@Override
	public void off() {
		boolean atLeastOneSensorOn = false;
	    for (Sensor sensor : sensors) {
	      if (sensor.ison()) {
	        atLeastOneSensorOn = true;
	        break;
	      }
	    }

	    if (atLeastOneSensorOn) {
	      this.isOn = false;
	      for (Sensor sensor : sensors) {
	        if (sensor.ison()) {
	          atLeastOneSensorOn = true;
	          break;
	        }
	      }

	      if (atLeastOneSensorOn) {
	        this.isOn = false;
	      }
	    }
	    }

	@Override
	public int measure() {
		if (!isOn) {
			throw new IllegalStateException("Cannot measure average when sensor is off");
			}

		if (sensors.isEmpty()) {
		    throw new IllegalStateException("Cannot measure average with no sensors");
		    }

		int sum = 0;
		for (Sensor sensor : sensors) {
			sum += sensor.measure();
		}
		    
		int average = sum / sensors.size();
		readings.add(average);
		
		return average;
		}
	
	public List<Integer> readings() {
	    return new ArrayList<>(readings);
	  }
}

