
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		HashMap<String, Employee> map = new HashMap<String, Employee>();
//		
//		Employee e1 = new Employee();
//		e1.setName("AK");
//		e1.setSalary(0);
//		e1.setSsn(1001);
////		System.out.println(e1);
//		map.put("1001",e1);
//		
//		Employee e2 = new Employee();
//		e2.setName("Qin");
//		e2.setSalary(0);
//		e2.setSsn(1002);
////		System.out.print(e2);		
//		map.put("1002", e2);
//		
//		Employee e3 = new Employee();
//		e3.setName("Carl");
//		e3.setSalary(20000);
//		e3.setSsn(10031);
//		map.put("1003", e3);
//		
//		System.out.println(map);
//		Iterator<Entry<String, Employee>> iter = map.entrySet().iterator();
//		while (iter.hasNext()) {
//			 Map.Entry<String, Employee> entry = iter.next();
//			 System.out.print("key:" + entry.getKey());
//			 System.out.println(", value:" + entry.getValue());
//		}
		
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
		
		List<Employee> employees = EmployeeAdmin.prepareReport(table, socSecNums);
		for (Employee item : employees) {
			System.out.print(item.getName() + ", " + item.getSalary() + ", " + item.getSsn());
			System.out.println();
		}	
	}
}
