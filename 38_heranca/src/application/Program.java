package application;

public class Program {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount();
		
		account.getHolder();
		account.getNumber();
		account.getBalance();
		account.deposit(0);

	}

}
