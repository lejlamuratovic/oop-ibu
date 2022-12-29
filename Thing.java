package lab10.boxes;
import java.util.Objects;

public class Thing {
	private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.name = name;
        this.weight = weight;
    }
    
    public Thing(String name) {
    	if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.name = name;
        this.weight = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Thing t = (Thing) obj;
    	return t.getWeight() == this.getWeight() && t.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}