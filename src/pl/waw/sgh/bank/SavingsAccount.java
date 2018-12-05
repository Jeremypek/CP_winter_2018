package pl.waw.sgh.bank;

//recap: super means take something from the parent something
public class SavingsAccount extends Account {
    public SavingsAccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public SavingsAccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
