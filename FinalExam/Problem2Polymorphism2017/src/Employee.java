import java.util.*;


public class Employee<BankAccount> {
	@SuppressWarnings("unused")
	private int id;
	private List<BankAccount> accounts;
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	
	Employee(int id, List<BankAccount> accounts) {
		this.id = id;
		this.accounts = accounts;
	}
}
