package classforname;

public class ForNameExample {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Student student = new Student();
		System.out.println(student.toString());
		Class<Student> student2 = (Class<Student>) Class.forName("classforname.Student");
		Student student3 = student2.newInstance();
	}
}
