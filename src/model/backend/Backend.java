package model.backend;

import entities.*;

import java.util.ArrayList;


/**
 * Interface backend declares CRUD methods
 */
public interface Backend {

    /**
     * Adds new book to the list
     * @param aBook
     */
    public void addBook(Book aBook) throws Exception;
    public ArrayList<Book> getBooks();
    public void updateBook(Book aBook) throws Exception;
    public void deleteBook(int bookId) throws Exception;

    /**
     * Adds new supplier to the list
     * @param aSupplier
     */
    public void addSupplier(Supplier aSupplier) throws Exception;
    public ArrayList<Supplier> getSuppliers();
    public void updateSupplier(Supplier aSupplier);
    public void deleteSupplier(int supplierId);

    /**
     * Adds new customer to the list
     * @param aCustomer
     */
    public void addCustomer(Customer aCustomer) throws Exception;
    public ArrayList<Customer> getCustomers();
    public void updateCustomer(Customer aCustomer);
    public void deleteCustomer(int customerId);

    /**
     * Adds new order to the list
     * @param aOrder
     */
    public void addOrder(Order aOrder) throws Exception;
    public ArrayList<Order> getOrders();
    public void updateOrder(Order aOrder);
    public void deleteOrder(int orderId);

    /**
     * Adds new Supplier_Book to the list
     * @param aSupplierBook
     */
    public void addSupplierBook(SupplierBook aSupplierBook);
    public ArrayList<SupplierBook> getSupplierBooks();
    public void updateSupplierBook(SupplierBook aSupplierBook);
    public void deleteSupplierBook(int supplierBookId);


}
