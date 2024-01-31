
public abstract class Account {
	protected float balance;
	
	Account(float balance){
		this.balance = balance;
	}
	
	
	public float getBalance() {
		return balance;
	
	}
	
	public void deposit(float amount) {
		balance += amount;
	}

}
