import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	public static List<Employee> prepareEmployee(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> employees = new ArrayList<Employee>();
		for (String ssn : socSecNums) {
			Employee employee = table.get(ssn);
			if (employee != null && employee.getSalary() >= 80000) {
				employees.add(employee);
			}
		}
		Collections.sort(employees, new EmployeeSsnComparetor());
		return employees;
	}
}

class EmployeeSsnComparetor implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSsn().compareTo(e2.getSsn());
	}
	
}
