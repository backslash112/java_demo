import java.util.*;

public class AccountManager {
	static double computeAccountBalanceSum(List<Employee<?>> employees) {
		double sum = 0;
		for(Employee<?> e: employees) {
			List<?> accounts = e.getAccounts();
			for(Object a: accounts) {
				sum += ((Account) a).getBalance();
			}
		}
		return sum;
	}
}
