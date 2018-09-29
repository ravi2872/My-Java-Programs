package overriding;

public class OverrideTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.display();
		Parent parent2 = new Child();
		parent2.display();
		Child child = new Child();
		child.display();
		Child child2 = (Child) new Parent();
		child2.display();
	}

}
