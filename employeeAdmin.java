import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> employees = new ArrayList<Employee>();
		for (String socSecNum : socSecNums) {
			Employee employee = table.get(socSecNum);
			if (employee != null && employee.getSalary() >= 8000) {
				employees.add(employee);
			}
		}
		
		// Sort the result
		Collections.sort(employees, new EmployeeSsnCompare());
		return employees;
	}
}

class EmployeeSsnCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return  e1.getSsn().compareTo(e2.getSsn());
//		return  e2.getSsn().compareTo(e1.getSsn());
	}
	
}
