package classforname;

public class ForNameExample2 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			throw new Exception();
		} catch (Exception e) {
			return;
		} finally {
			System.out.println("Finally");
		}
	}
}
