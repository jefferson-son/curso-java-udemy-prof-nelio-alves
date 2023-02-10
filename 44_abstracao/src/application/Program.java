package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Classes abstratas não podem ser instanciadas

		Account acc1 = new SavingsAccount(1001, "Maria", 500.0, 0.01);
		Account acc2 = new BusinessAccount(1002, "Alex", 3000.0, 400.0);
		Account acc3 = new SavingsAccount(1003, "Bob", 600.0, 0.01);
		Account acc4 = new BusinessAccount(1004, "Ana", 1500.0, 600.0);

		List<Account> list = new ArrayList<>();

		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total account value: $ %.2f%n", sum);
		System.out.println();

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("ID: %d, total: %.2f%n", acc.getNumber(), acc.getBalance());
		}

		double sumUpDate = 0.0;
		for (Account acc : list) {
			sumUpDate += acc.getBalance();
		}

		System.out.println();
		System.out.printf("Updated total account value: $ %.2f%n", sumUpDate);

	}
}
