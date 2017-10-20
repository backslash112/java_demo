import java.util.List;

public class Statistics {
	static double computeSumOfSalaries(List<EmployeeData> data) {
		double sum = 0;
		for (EmployeeData e: data) {
			sum += e.getSalary();
		}
		return sum;
	}
}
