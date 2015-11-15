package entities;

/**
 * Created by ben on 11/11/2015.
 */
public class Customer
{

    private int KeyID; // key of the customer
    private int CustID; // teoudat zeout
    private String CustFirstName; // first name
    private String CustLastName;    // last name
    private String CustEmail;   //email address
    private String CustPhone;   // phone number
    private boolean deleted;

    // constructor
    public Customer(String custFirstName, String custLastName, String custEmail, String custPhone, int custID) {
        CustFirstName = custFirstName;
        CustLastName = custLastName;
        CustEmail = custEmail;
        CustPhone = custPhone;
        CustID = custID;
        this.deleted = false;
    }

    public Customer() {
    }

    //getter and setter
    public int getKeyID() {return KeyID;}
    public void setKeyID(int keyID) { this.KeyID = keyID; }

    public int getCustID() {return CustID;}
    public void setCustID(int custID) {CustID = custID;}

    public String getCustFirstName() {
        return CustFirstName;
    }
    public void setCustFirstName(String custFirstName) {
        CustFirstName = custFirstName;
    }

    public String getCustLastName() {
        return CustLastName;
    }
    public void setCustLastName(String custLastName) {
        CustLastName = custLastName;
    }

    public String getCustEmail() {
        return CustEmail;
    }
    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public String getCustPhone() {
        return CustPhone;
    }
    public void setCustPhone(String custPhone) {CustPhone = custPhone;}

    public boolean isDeleted() {return deleted;}
    public void setDeleted(boolean deleted) {this.deleted = deleted;}
}
