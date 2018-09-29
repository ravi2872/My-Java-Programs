package forname;

import lambda.methodreference.MethodReferenceExample;

public class ClassForNameExample {

	public static void main(String[] args) throws ClassNotFoundException {
		@SuppressWarnings("unchecked")
		Class<MethodReferenceExample> myClass = (Class<MethodReferenceExample>) Class
				.forName("lambda.methodreference.MethodReferenceExample");
		System.out.println(myClass + "  " + myClass.toString());

		@SuppressWarnings("unchecked")
		Class<MethodReferenceExample> myClass1 = (Class<MethodReferenceExample>) Class
				.forName("lambda.methodreference.MethodReferenceExample");
		System.out.println(myClass + "  " + myClass1.toString());
	}

}
