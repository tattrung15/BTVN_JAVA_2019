package model;

public class BookReaderManagement{
    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private String status;
    private int totalBorrow;

    public BookReaderManagement() {
    }

    public BookReaderManagement(Book book, Reader reader, int numOfBorrow, String status, int totalBorrow) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.status = status;
        this.totalBorrow = totalBorrow;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public String getState() {
        return status;
    }

    public void setState(String state) {
        this.status = state;
    }

    public int getTotalBorrow() {
        return totalBorrow;
    }

    public void setTotalBorrow(int totalBorrow) {
        this.totalBorrow = totalBorrow;
    }

    @Override
    public String toString() {
        return "BookReaderManagement{" +
                "bookID=" + book.getBookID() +
                ", bookName=" + book.getBookName() +
                ", readerID=" + reader.getReaderID() +
                ", readerName=" + reader.getFullName() +
                ", numOfBorrow=" + numOfBorrow +
                ", state='" + status + '\'' +
                ", totalBorrow=" + totalBorrow +
                '}';
    }
}
