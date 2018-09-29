package comparator;

public class Employee implements Comparable<Employee> {
	private String empId;

	public Employee(String empId) {
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getEmpId().compareTo(o.getEmpId());
	}

}
