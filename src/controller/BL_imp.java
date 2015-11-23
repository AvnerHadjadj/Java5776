package controller;

import entities.*;
import model.backend.Backend;
import model.backend.BackendFactory;
import model.backend.BackendImp;

import java.util.ArrayList;

/**
 * Created by MacBook on 23/11/15.
 */
public class BL_imp implements IBL {

    Backend backend = BackendFactory.getBackend();

    @Override
    public void addBook(Book aBook) throws Exception {
        backend.addBook(aBook);
    }

    @Override
    public ArrayList<Book> getBooks() {
        return backend.getBooks();
    }

    @Override
    public void updateBook(Book aBook) throws Exception {

    }

    @Override
    public void deleteBook(int bookId) throws Exception {

    }

    @Override
    public void addSupplier(Supplier aSupplier) throws Exception {

    }

    @Override
    public ArrayList<Supplier> getSuppliers() {
        return null;
    }

    @Override
    public void updateSupplier(Supplier aSupplier) {

    }

    @Override
    public void deleteSupplier(int supplierId) {

    }

    @Override
    public void addCustomer(Customer aCustomer) throws Exception {

    }

    @Override
    public ArrayList<Customer> getCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(Customer aCustomer) {

    }

    @Override
    public void deleteCustomer(int customerId) {

    }

    @Override
    public void addOrder(Order aOrder) throws Exception {

        // stock -1
        for(SupplierBook B : aOrder.getBooksInOrder()) {
            // we add searchSupplierBookById( supplierBookId)

            B.setQtyInStock(B.getQtyInStock() - 1);
            backend.updateSupplierBook(B);
        }
    }

    @Override
    public ArrayList<Order> getOrders() {
        return null;
    }

    @Override
    public void updateOrder(Order aOrder) {

    }

    @Override
    public void deleteOrder(int orderId) {

    }

    @Override
    public void addSupplierBook(SupplierBook aSupplierBook) {

    }

    @Override
    public ArrayList<SupplierBook> getSupplierBooks() {
        return null;
    }

    @Override
    public void updateSupplierBook(SupplierBook aSupplierBook) {

    }

    @Override
    public void deleteSupplierBook(int supplierBookId) {

    }


    // Busines Layer methods

    @Override
    public Book SearchBook(int bookId) throws Exception{
        for (Book B : getBooks())
            if (B.getBookId() == bookId)
                return B;
        throw (new Exception("The book number " + bookId + " doesn't exist."));
    }

    @Override
    public SupplierBook SearchSupplierBook(int supplierBookId) throws Exception {
        for (SupplierBook SB : getSupplierBooks())
            if (SB.getBookId() == supplierBookId)
                return SB;
        throw (new Exception("The book number " + supplierBookId + " doesn't exist."));
    }

    /**
     * search book by category in the SupplierBooks list
     * @param category
     * @return BooksByCategory, new list of all books in this category
     * @throws Exception if the new list is empty, no found books in this category
     */
    public ArrayList<SupplierBook> getBooksByCategory(BookCategory category) throws Exception
    {
        ArrayList<SupplierBook> BooksByCategory = new ArrayList<SupplierBook>();
        for (SupplierBook B : getSupplierBooks())
        {
            if (SearchBook(B.getBookId()).getCategory() == category)
                BooksByCategory.add(B);
        }
        if (BooksByCategory == null)
            throw (new Exception("no books in this category"));
        return BooksByCategory;
    }
}
