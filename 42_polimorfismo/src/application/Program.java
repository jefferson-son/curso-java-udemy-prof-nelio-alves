package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		// Variáveis do mesmo tipo, mas que apontam e se comportam como objetos diferentes.
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1021, "Bob", 1000.0, 0.01);
		
		x.whitdraw(50.0);
		y.whitdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
