package model;

public class BookReaderManagement{
    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private String status;
    private int totalBorrow;
    private String dateTime;

    public BookReaderManagement() {
    }

    public BookReaderManagement(Book book, Reader reader, int numOfBorrow, String status, int totalBorrow) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.status = status;
        this.totalBorrow = totalBorrow;
    }

    public BookReaderManagement(Book book, Reader reader, int numOfBorrow, String status, int totalBorrow, String dateTime) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.status = status;
        this.totalBorrow = totalBorrow;
        this.dateTime = dateTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String state) {
        this.status = state;
    }

    public int getTotalBorrow() {
        return totalBorrow;
    }

    public void setTotalBorrow(int totalBorrow) {
        this.totalBorrow = totalBorrow;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "BookReaderManagement{" +
                "readerID=" + reader.getReaderID() +
                ", readerName=" + reader.getFullName() +
                ", bookID=" + book.getBookID() +
                ", bookName=" + book.getBookName() +
                ", numOfBorrow=" + numOfBorrow +
                ", state='" + status + '\'' +
                ", totalBorrow=" + totalBorrow +
                ", dateTime=" + dateTime +
                '}';
    }
}
