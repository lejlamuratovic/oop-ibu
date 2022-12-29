package lab10.boxes;
import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private double maxWeight;
    private List<Thing> things;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (things.stream().mapToDouble(Thing::getWeight).sum() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}