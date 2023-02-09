package entities;

// Erro ocorre pois não é possível herdar a classe final SavingsAccount 
public class SavingsAccountPlus extends SavingsAccount{

	@Override /*Erro occore pois não é possível criar o método a partir do metodo final*/
	public void whitdraw(double amount) {
		balance -= amount;
	}
}
