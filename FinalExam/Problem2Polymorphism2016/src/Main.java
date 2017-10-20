import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello USA!");
		
		List<Staff> staffs = new ArrayList<Staff>();
		staffs.add(new Staff("Carl", 20000, 3));
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("Lucy", 10000, 10000));
		List<EmployeeData> employees = combine(teachers, staffs);
		double sum = Statistics.computeSumOfSalaries(employees);
		System.out.println("sum: " + sum);
	}
	
	public static List<EmployeeData> combine(List<Teacher> teachers, List<Staff> staffs) {
		List<EmployeeData> employees = new ArrayList<EmployeeData>();
		employees.addAll(teachers);
		employees.addAll(staffs);
		return employees;
	}

}
