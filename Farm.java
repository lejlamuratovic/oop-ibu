package lab10.simulator;
import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
	private String owner;
	private Barn barn;
	private Collection<Cow> cows;

	public Farm(String owner, Barn barn) {
		this.owner = owner;
		this.barn = barn;
		this.cows = new ArrayList<>();
	}

	public String getOwner() {
		return this.owner;
	}

	public void addCow(Cow cow) {
		this.cows.add(cow);
	}

	public void installMilkingRobot(MilkingRobot robot) {
		this.barn.installMilkingRobot(robot);
	}

	public void manageCows() {
		this.barn.takeCareOf(cows);
	}

	@Override
	public void liveHour() {
		for (Cow cow : this.cows) {
			cow.liveHour();
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Farm owner: " + owner + "\n");
		sb.append("Barn bulk tank: " + barn.getBulkTank() + "\n");
		sb.append("Animals:\n");
		if (cows.isEmpty()) {
		    sb.append("No cows\n");
		} else {
			for (Cow cow : cows) {
		      sb.append(cow + "\n");
		    }
		  }
		
		  return sb.toString();
	}
	
}

