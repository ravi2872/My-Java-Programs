package wipro;

public class Instance {
	private static int instanceCount;

	public Instance() {
		instanceCount++;
	}

	public static int numberOfInstancesCreated() {
		return instanceCount;
	}
}
