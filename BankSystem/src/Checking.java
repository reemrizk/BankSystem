
public class Checking extends Account{
	
	Checking(float balance, float amount) {
		super(balance);
		
	}
	
	public void withdraw(float amount) {
		
		if (amount > balance) {
			System.out.println("Cannot withdraw amount greater than balance.");
		}
		else {
			balance -= amount;
		}
	}

}
