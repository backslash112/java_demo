
public final class Staff implements EmployeeData {
	private String name;
	private  double salary;
	private int numDependants;
	
	public Staff(String name, double salary, int numDependants) {
		this.setName(name);
		this.salary = salary;
		this.setNumDependants(numDependants);
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumDependants() {
		return numDependants;
	}

	public void setNumDependants(int numDependants) {
		this.numDependants = numDependants;
	}
	
}
