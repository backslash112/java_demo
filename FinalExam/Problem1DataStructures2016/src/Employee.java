
public class Employee {
	private String name;
	private int salary;
	private String ssn;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	Employee(String name, int salary, String ssn) {
		this.setName(name);
		this.setSalary(salary);
		this.setSsn(ssn);
	}
}
