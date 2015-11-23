package entities;

import java.util.List;

/**
 * order books
 */
public class Order
{
    private int OrderID;
    private int AmountBook; // amount books in order
    private double PriceAllOrder; // sum the price of the order
    private List<SupplierBook> BooksInOrder;
    private int SuppID; // id supplier
    private int CustID;
    private boolean deleted;

    //constructor


    public Order(int orderID, int amountBook, double priceAllOrder, List<SupplierBook> booksInOrder, int suppID, int custID) {
        OrderID = orderID;
        AmountBook = amountBook;
        PriceAllOrder = priceAllOrder;
        BooksInOrder = booksInOrder;
        SuppID = suppID;
        CustID = custID;
        this.deleted = false;
    }

    public Order() {
    }

    // getter and setter
    public int getOrderID() {return OrderID;}
    public void setOrderID(int orderID) {OrderID = orderID;}

    public int getAmountBook() {return AmountBook;}
    public void setAmountBook(int amountBook) {AmountBook = amountBook;}

    public double getPriceAllOrder() {return PriceAllOrder;}
    public void setPriceAllOrder(double priceAllOrder) {PriceAllOrder = priceAllOrder;}

    public List<SupplierBook> getBooksInOrder() {return BooksInOrder;}
    public void setBooksInOrder(List<SupplierBook> booksInOrder) {BooksInOrder = booksInOrder;}

    public int getSuppID() {return SuppID;}
    public void setSuppID(int suppID) {SuppID = suppID;}


    public int getCustID() {return CustID;}
    public void setCustID(int custID) {CustID = custID;}

    public boolean isDeleted() {return deleted;}
    public void setDeleted(boolean deleted) {this.deleted = deleted;}
}
