package strings;

public class DecimalIncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer num = new StringBuffer("1");
		for (int i = 0; i < 5; i++) {
			num.append(".1");
		}
		System.out.println("Number is :" + num);

	}

}
