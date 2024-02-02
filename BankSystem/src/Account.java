
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
		if (balance < 0) {
			System.out.println("ERROR: Balance cannot fall below zero. broke boi");
		}
		
	}

}
