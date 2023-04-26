package banking;

/**
 * A bank transaction implementation.
 */
public class Transaction implements TransactionInterface {
    private Long accountNumber;
    private BankInterface bank;
    private int attemptedPin;

    /**
     * @param bank          The bank where the account is housed.
     * @param accountNumber The customer's account number.
     * @param attemptedPin  The PIN entered by the customer.
     * @throws Exception Account validation failed.
     */
    
    public Transaction(Long accountNumber, BankInterface bank, int attemptedPin) {
		super();
		this.accountNumber = accountNumber;
		this.bank = bank;
		this.attemptedPin = attemptedPin;
	}
    
    public double getBalance() {
        // TODO: complete the method
        return -1;
    }


	public void credit(double amount) {
        // TODO: complete the method
    }

    public boolean debit(double amount) {
        // TODO: complete the method
        return false;
    }
}
