package lab8;

class GenericClass<T> {
	private T value;
	
	public GenericClass(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	public String toString() {
		return this.value.getClass().getSimpleName() + " value: " + this.getValue();
	}
}
