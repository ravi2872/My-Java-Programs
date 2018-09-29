package streams;

public class Person {
	private String name;
	private int age;
	private float sal;

	public Person(String name, int age, float sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

}
