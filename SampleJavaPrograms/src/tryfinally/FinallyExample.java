package tryfinally;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FinallyExample {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>();
		try {
			List<String> list = new ArrayList<>();
			list.forEach(null);
			System.out.println("Hi");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
