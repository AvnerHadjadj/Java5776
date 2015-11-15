package entities;

import java.util.List;

/**
 * Created by ben on 11/11/2015.
 */
public class Supplier
{
    private int SuppID; // id supplier
    private String SuppFirstName; // first name
    private String SuppLastName;    // last name
    private String SuppEmail;   //email address
    private String SuppPhone;   // phone number
    private List<Book> SuppBoks; // list of all Supplier's books
    private boolean deleted;

    // constructor
    public Supplier(String suppFirstName, String suppLastName, String suppEmail, String suppPhone, List<Book> suppBoks, int suppID) {
        SuppFirstName = suppFirstName;
        SuppLastName = suppLastName;
        SuppEmail = suppEmail;
        SuppPhone = suppPhone;
        SuppBoks = suppBoks;
        SuppID = suppID;
        this.deleted = false;
    }

    public Supplier() {
    }

    // getter and setter

    public int getSuppID() {return SuppID;}
    public void setSuppID(int suppID) {SuppID = suppID;}

    public String getSuppFirstName() {
        return SuppFirstName;
    }
    public void setSuppFirstName(String suppFirstName) {
        SuppFirstName = suppFirstName;
    }

    public String getSuppLastName() {
        return SuppLastName;
    }
    public void setSuppLastName(String suppLastName) {
        SuppLastName = suppLastName;
    }

    public String getSuppEmail() {
        return SuppEmail;
    }
    public void setSuppEmail(String suppEmail) {
        SuppEmail = suppEmail;
    }

    public String getSuppPhone() {
        return SuppPhone;
    }
    public void setSuppPhone(String suppPhone) {
        SuppPhone = suppPhone;
    }

    public List<Book> getSuppBoks() {
        return SuppBoks;
    }
    public void setSuppBoks(List<Book> suppBoks) {
        SuppBoks = suppBoks;
    }

    public boolean isDeleted() {return deleted;}
    public void setDeleted(boolean deleted) {this.deleted = deleted;}
}
