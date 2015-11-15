package entities;

/**
 * Created by ben on 11/11/2015.
 */
public class Book
{
    //methods
    private int bookId;
    private String BookName;
    private double BookPrice;
    private BookCategory category;
    private boolean deleted;

    // constractor
    public Book(int bookId, String BookName,  double BookPrice, BookCategory category) {
        this.bookId = bookId;
        this.BookName = BookName;
        this.BookPrice = BookPrice;
        this.category = null;
        this.deleted = false;
    }

    public Book() {
    }

    //getter and setter
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {this.bookId = bookId;}

    public String getName() {
        return BookName;
    }
    public void setName(String BookName) {
        this.BookName = BookName;
    }

    public double getPrice() {
        return BookPrice;
    }
    public void setPrice(double BookPrice) {
        this.BookPrice = BookPrice;
    }

    public BookCategory getCategory() { return category;}
    public void setCategory(BookCategory category) { this.category = category; }

    public boolean isDeleted() {return deleted;}
    public void setDeleted(boolean deleted) {this.deleted = deleted;}
}
