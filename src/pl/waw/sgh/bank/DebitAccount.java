package pl.waw.sgh.bank;

import java.math.BigDecimal;

//extends Account and right click generate constructor
public class DebitAccount extends Account {
    public DebitAccount(Integer accountID, Double balance, String currency, Customer customer) {
        super(accountID, balance, currency, customer);
    }

    public DebitAccount(Integer accountID, Double balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
