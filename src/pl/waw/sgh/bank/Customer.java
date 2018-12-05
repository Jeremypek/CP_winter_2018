package pl.waw.sgh.bank;

public class Customer {

    private Integer customerID;

    private String firstName;

    private String lastName;

    private String email;

    //set up Constructor
    public Customer(Integer customerID, String firstName, String lastName, String email) {
        this.customerID = customerID;
        this.firstName = firstName; //what is the effect of this line? the argument input will be put into the on top
        this.lastName = lastName;
        this.email = email;
    }

    //right click, getter and setter
    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "ID=" + customerID +
                ", fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", @='" + email + '\'' +
                '}';
    }
}
