package entities;

/**
 * Created by ben on 11/11/2015.
 */
public class SupplierBook
{
    private int KeyID;
    private int qtyInStock; // quantity book in stock
    private int SuppID; // id supplier
    private int bookId;
    private double priceBook;
    private boolean deleted;

    // constructor

    public SupplierBook(int qtyInStock, int suppID, int bookId, double priceBook) {
        this.qtyInStock = qtyInStock;
        SuppID = suppID;
        this.bookId = bookId;
        this.priceBook = priceBook;
        this.deleted = false;
    }

    public SupplierBook() {
    }

    // getter and setter
    public int getQtyInStock() {return qtyInStock;}
    public void setQtyInStock(int qtyInStock) {this.qtyInStock = qtyInStock;}

    public int getSuppID() {return SuppID;}
    public void setSuppID(int suppID) {SuppID = suppID;}

    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {this.bookId = bookId;}

    public double getPriceBook() {return priceBook;}
    public void setPriceBook(double priceBook) {this.priceBook = priceBook;}

    public boolean isDeleted() {return deleted;}
    public void setDeleted(boolean deleted) {this.deleted = deleted;}

    public int getKeyID() {return KeyID;}
    public void setKeyID(int keyID) {KeyID = keyID;}

}
