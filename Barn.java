package lab10.simulator;
import java.util.Collection;

public class Barn {
	private BulkTank tank;
	private MilkingRobot robot;

	public Barn(BulkTank tank) {
		this.tank = tank;
		this.robot = null;
	}

	public BulkTank getBulkTank() {
		return this.tank;
	}

	public void installMilkingRobot(MilkingRobot robot) {
		this.robot = robot;
		robot.setBulkTank(tank);
	}

	public void takeCareOf(Cow cow) {
		if (this.robot == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		}

		this.robot.milk(cow);
	}

	public void takeCareOf(Collection<Cow> cows) {
		if (this.robot == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		}

		for (Cow cow : cows) {
			this.robot.milk(cow);
		}
	}

	public String toString() {
		return this.tank.toString();
	}
	
}

