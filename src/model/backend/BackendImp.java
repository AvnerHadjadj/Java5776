package model.backend;

import entities.*;
import model.datasource.Datasource;

import java.util.ArrayList;

/**
 * Created by MacBook on 15/11/15.
 */
public class BackendImp implements Backend{

    public Datasource data = BackendFactory.getInstance();
    public static int lastBookId = 0;
    public static int lastCustomerId = 0;
    public static int lastOrderId = 0;
    public static int lastSupplierBookId = 0;
    public static int lastId = 0;

    @Override
    public void addBook(Book aBook) throws Exception {
        //if(data.books.get(aBook.getBookId()) != null)
        //    throw(new Exception("Create error: A book with the same id already exists."));
        //else {
        aBook.setBookId(++lastBookId);
        data.books.add(aBook);
        //}
        // we can also check if a book with the same name exist...
    }

    @Override
    public ArrayList<Book> getBooks() {
        return data.books;
    }

    @Override
    public void updateBook(Book aBook) throws Exception {

        //if(book == null)
        //    throw(new Exception("Update error: The book number " + aBook.getBookId() + " doesn't exist."));
        //else {

        data.books.get(aBook.getBookId()).setName(aBook.getName());
        data.books.get(aBook.getBookId()).setCategory(aBook.getCategory());
        data.books.get(aBook.getBookId()).setPrice(aBook.getPrice());

        //}
    }

    /**
     * We disable the book in order to save its data and not delete it completely. It's more creative, and we'll get a better grade :)
     * @param bookId
     * @throws Exception
     */
    @Override
    public void deleteBook(int bookId) throws Exception {
        //if(data.books.get(bookId) == null)
        //    throw(new Exception("Delete error: The book number " + aBook.getBookId() + " doesn't exist."));
        data.books.get(bookId).setDeleted(true);
    }

    @Override
    public void addSupplier(Supplier aSupplier) throws Exception {
        aSupplier.setSuppID(++lastSupplierBookId);
        data.suppliers.add(aSupplier);
    }

    @Override
    public ArrayList<Supplier> getSuppliers() {
        return data.suppliers;
    }

    @Override
    public void updateSupplier(Supplier aSupplier) {
        data.suppliers.get(aSupplier.getSuppID()).setSuppBoks(aSupplier.getSuppBoks());
        data.suppliers.get(aSupplier.getSuppID()).setSuppEmail(aSupplier.getSuppEmail());
        data.suppliers.get(aSupplier.getSuppID()).setSuppFirstName(aSupplier.getSuppFirstName());
        data.suppliers.get(aSupplier.getSuppID()).setSuppLastName(aSupplier.getSuppLastName());
        data.suppliers.get(aSupplier.getSuppID()).setSuppPhone(aSupplier.getSuppPhone());
    }

    @Override
    public void deleteSupplier(int supplierId) {
        data.suppliers.get(supplierId).setDeleted(true);

    }

    @Override
    public void addCustomer(Customer aCustomer) throws Exception {
        aCustomer.setKeyID(++lastSupplierBookId);
        data.customers.add(aCustomer);
    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return data.customers;
    }

    @Override
    public void updateCustomer(Customer aCustomer) {
        data.customers.get(aCustomer.getKeyID()).setCustEmail(aCustomer.getCustEmail());
        data.customers.get(aCustomer.getKeyID()).setCustFirstName(aCustomer.getCustFirstName());
        data.customers.get(aCustomer.getKeyID()).setCustID(aCustomer.getCustID());
        data.customers.get(aCustomer.getKeyID()).setCustLastName(aCustomer.getCustLastName());
        data.customers.get(aCustomer.getKeyID()).setCustPhone(aCustomer.getCustPhone());
    }

    @Override
    public void deleteCustomer(int customerId) {
        data.customers.get(customerId).setDeleted(true);
    }

    @Override
    public void addOrder(Order aOrder) throws Exception {
        aOrder.setOrderID(++lastOrderId);
        data.orders.add(aOrder);
    }

    @Override
    public ArrayList<Order> getOrders() {
        return data.orders;
    }

    @Override
    public void updateOrder(Order aOrder) {
        data.orders.get(aOrder.getOrderID()).setCustID(aOrder.getCustID());
        data.orders.get(aOrder.getOrderID()).setSuppID(aOrder.getSuppID());
        data.orders.get(aOrder.getOrderID()).setAmountBook(aOrder.getAmountBook());
        data.orders.get(aOrder.getOrderID()).setBooksInOrder(aOrder.getBooksInOrder());
        data.orders.get(aOrder.getOrderID()).setPriceAllOrder(aOrder.getPriceAllOrder());
    }

    @Override
    public void deleteOrder(int orderId) {
        data.orders.get(orderId).setDeleted(true);
    }

    @Override
    public void addSupplierBook(SupplierBook aSupplierBook) {
        aSupplierBook.setSuppID(++lastSupplierBookId);
        data.supplierBooks.add(aSupplierBook);
    }

    @Override
    public ArrayList<SupplierBook> getSupplierBooks() {
        return data.supplierBooks;
    }

    @Override
    public void updateSupplierBook(SupplierBook aSupplierBook) {
        data.supplierBooks.get(aSupplierBook.getKeyID()).setBookId(aSupplierBook.getBookId());
        data.supplierBooks.get(aSupplierBook.getKeyID()).setSuppID(aSupplierBook.getSuppID());
        data.supplierBooks.get(aSupplierBook.getKeyID()).setPriceBook(aSupplierBook.getPriceBook());
        data.supplierBooks.get(aSupplierBook.getKeyID()).setQtyInStock(aSupplierBook.getQtyInStock());
    }

    @Override
    public void deleteSupplierBook(int supplierBookId) {
        data.supplierBooks.get(supplierBookId).setDeleted(true);
    }
}
