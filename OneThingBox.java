package lab10.boxes;

public class OneThingBox extends Box {
	private Thing thing;
	
	public OneThingBox() {
		this.thing = null;
	}

	@Override
	public void add(Thing thing) {
		if (this.thing == null) {
			this.thing = thing;
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return this.thing != null && this.thing.equals(thing);
	}
}
