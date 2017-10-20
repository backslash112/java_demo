
public final class Teacher implements EmployeeData {
	private String name;
	private double salary;
	private double bouns;
	
	public Teacher(String name, double salary, double bouns) {
		this.name = name;
		this.salary =  salary;
		this.bouns = bouns;
}
	@Override
	public double getSalary() {
		return this.salary + this.bouns;
	}
	
	public String getName() {
		return name;
	}
}