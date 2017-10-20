
public abstract class Account {
	double balance;
	abstract double getBalance();
	Account(double balance) {
		this.balance = balance;
	}
}
