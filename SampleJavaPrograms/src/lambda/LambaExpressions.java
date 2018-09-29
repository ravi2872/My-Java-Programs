package lambda;

public class LambaExpressions {

	public static void main(String[] args) {
		Add addFunc = (int a, int b) -> a + b;
		Devide devide = (int a, int b) -> {
			if (b != 0) {
				return a / b;
			}
			return 0;
		};

		addLambda(addFunc);
		addLambda((int a, int b) -> a + b);
	}

	public static void addLambda(Add add) {
		System.out.println(add.add(2, 3));
	}

}

interface Add {
	int add(int a, int b);
}

interface Devide {
	int devide(int a, int b);
}