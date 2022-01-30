package rocks.shumyk.functional.real.example;

public interface AccountFactory {
	BankAccount getBankAccount(int id, double balance, String accountName);
}
