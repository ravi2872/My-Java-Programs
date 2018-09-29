package classforname;

public class Student {
	String name;

	static {
		System.out.println("Static Block Executed");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
