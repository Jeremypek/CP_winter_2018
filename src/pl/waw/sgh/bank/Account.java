package pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Account {

    private Integer accountID;

    private BigDecimal balance; //BigDecimal is usually use for financial data

    private String currency = "USD";

    private Customer customer;

    //generate two constructors, one without currency
    public Account(Integer accountID, Double balance, String currency, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.currency = currency;
        this.customer = customer;
    }

    //why this because if we dont need to use currency, we can use this
    //changed the balance in the ( ) to Double and this.balance to new bigdecimal
    public Account(Integer accountID, Double balance, Customer customer) {
        this.accountID = accountID;
        this.balance = new BigDecimal(balance);
        this.balance.setScale(2);
        this.customer = customer;
    }

    public void deposit(Double amount) {
        balance = balance.add(new BigDecimal(amount));

         /*BigDecimal res = balance.add(new BigDecimal(amount));
         this.balance = res;
    */
    }

    public void charge(Double amount) {
        balance = balance.subtract(new BigDecimal(amount));
    }

    //getter and setter
    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //generate toString() and tweak it
    @Override
    public String toString() {
        return this.getClass().getSimpleName().replace("Account", "") + "{" +
                "ID=" + accountID +
                ", " + currency + "=" + balance +
                ", cust=" + customer.getCustomerID() +
                '}';
    }
}
