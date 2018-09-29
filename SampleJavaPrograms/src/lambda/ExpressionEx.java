package lambda;

public class ExpressionEx {

	public static void main(String[] args) {

		ExpressionEx tester = new ExpressionEx();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		Drawaing d = (String message) -> System.out.println("Drawing : " + message);

		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
		d.draw("Hello");

		Greetings greetings = (String s) -> System.out.println("Hello " + s);
		greetings.sayHello("Ravi");
		greetings.sayHai();
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	interface Drawaing {
		public void draw(String message);
	}
}
