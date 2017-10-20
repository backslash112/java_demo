import java.util.*;


public class Main {

	public static void main(String[] args) {
		List<Employee<?>> employees = new ArrayList<Employee<?>>();
		
		// List<Account> accounts1 = new ArrayList<Account>();
		// accounts1.add(new CheckingAccount(0));
		// accounts1.add(new RetirementAccount(100));
		// accounts1.add(new SavingsAccount(200000));
		
		Account[] accounts1Elements = new Account[] { 
			new CheckingAccount(0), 
			new RetirementAccount(100), 
			new SavingsAccount(200000)
		};
		List<Account> accounts1 = Arrays.asList(accounts1Elements);
		
		
		Employee<Account> carl = new Employee<Account>(1001, accounts1);
		employees.add(carl);
		
		double sum = AccountManager.computeAccountBalanceSum(employees);
		System.out.println("sum=" + sum);
	}

}
