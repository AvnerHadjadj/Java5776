package model.datasource;

import java.io.Serializable;
import java.util.ArrayList;
import entities.*;
import model.backend.Backend;

/**
 * Created by MacBook on 15/11/15.
 */
public class Datasource implements Serializable {

    public ArrayList<Book> books;
    public ArrayList<Customer> customers;
    public ArrayList<Order> orders;
    public ArrayList<Supplier> suppliers;
    public ArrayList<SupplierBook> supplierBooks;

}

