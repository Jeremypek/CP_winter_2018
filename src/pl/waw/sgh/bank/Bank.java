package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> custList = new ArrayList<>();

    private List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 100;

    //all private so far because we dont want to expose the fields
    //now Public API
    public Customer newCustomer(String firstName, String lastName, String email) {
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        //lastCustID++ will use the current one and increment it
        custList.add(cust);
        return cust;
    }

    public Account newAccount(Customer cust, String accType) {
        Account acc;
        //switch is like a multiple Ifs
        switch (accType) {
            case "Savings":
                acc = new SavingsAccount(lastAccID++, 0.0, cust);
                break;
            case "Debit":
                acc = new DebitAccount(lastAccID++, 0.0, cust);
                break;
            default:
                acc = new CheckingAccount(lastAccID++, 0.0, cust);
        }
        accList.add(acc);
        return acc;
    }

    private Account findAccountByID(Integer accID) {
        for (Account acc : accList) {
            if (acc.getAccountID().equals(accID))
                return acc;
        }
        return null;
    }

    public void transfer(Integer fromAccID, Integer toAccID, Double amount) {


    }

    //generate toString()
    @Override
    public String toString() {
        return "Bank{" +
                "custs=\n" + custList +
                ", \naccs=\n" + accList +
                '}';
    }
}
