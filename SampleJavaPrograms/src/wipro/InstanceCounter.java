package wipro;

public class InstanceCounter {
	public static void main(String[] args) {
		Instance instance = new Instance();
		Instance instance2 = new Instance();
		Instance instance3 = new Instance();

		System.out.println(Instance.numberOfInstancesCreated());
	}
}
