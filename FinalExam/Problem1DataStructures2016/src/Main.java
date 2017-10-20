import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		HashMap<String, Employee> table = new HashMap<String, Employee>();
		table.put("223456789", new Employee("Jim", 90000, "223456789"));
		table.put("100456789", new Employee("Tom", 88000, "100456789"));
		table.put("630426389", new Employee("Don", 60000, "630426389"));
		table.put("777726389", new Employee("Obi", 60000, "777726389"));
		
		List<String> socSecNums = new ArrayList<String>();
		socSecNums.add("630426389");
		socSecNums.add("223456789");
		socSecNums.add("929333111");
		socSecNums.add("100456789");
		
		List<Employee> employees = EmployeeAdmin.prepareEmployee(table, socSecNums);
		for (Employee item: employees) {
			System.out.print(item.getName() + ", " + item.getSsn() + ", " + item.getSalary());
			System.out.println();
		}
	}

}
