package controller;

import model.Book;
import model.BookReaderManagement;
import model.Reader;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void OpenFileToWrite(String fileName){
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CloseFileAfterWrite(){
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void OpenFileToRead(String fileName){
        try {
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void CloseFileAfterRead(){
        try {
            scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void WriteBookToFile(String fileName, Book book){
        OpenFileToWrite(fileName);
        printWriter.println(book.getBookID() + "|" + book.getBookName() + "|" + book.getAuthor() + "|" +
                book.getSpecialization() + "|" + book.getPublishYear() + "|" + book.getQuantity());
        CloseFileAfterWrite();
    }

    public void WtriteReaderToFile(String fileName, Reader reader){
        OpenFileToWrite(fileName);
        printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|" + reader.getAddress() + "|" +
                reader.getPhoneNumber());
        CloseFileAfterWrite();
    }

    public void WriteBRMtoFile(String fileName, BookReaderManagement brm){
        OpenFileToWrite(fileName);
        printWriter.println(brm.getReader().getReaderID() + "|" + brm.getBook().getBookID() + "|" +
                brm.getNumOfBorrow() + "|" + brm.getStatus() + "|" + brm.getTotalBorrow() + "|" + brm.getDateTime());
        CloseFileAfterWrite();
    }

    public ArrayList<Reader> ReadReaderFromFile(String fileName){
        OpenFileToRead(fileName);
        ArrayList<Reader> readers = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            Reader reader = createReaderFromData(data);
            readers.add(reader);
        }
        CloseFileAfterRead();
        return readers;
    }

    private Reader createReaderFromData(String data) {
        String[] datas = data.split("\\|");
        Reader reader = new Reader(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3]);
        return reader;
    }

    public ArrayList<Book> ReadBookFromFile(String fileName){
        OpenFileToRead(fileName);
        ArrayList<Book> books = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            Book book = createBookFromData(data);
            books.add(book);
        }
        CloseFileAfterRead();
        return books;
    }

    private Book createBookFromData(String data) {
        String[] datas = data.split("\\|");
        Book book = new Book(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3],
                Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));
        return book;
    }

    public ArrayList<BookReaderManagement> ReadBRMFromFile(String fileName){
        ArrayList<Book> books = ReadBookFromFile("BOOK.DAT");
        ArrayList<Reader> readers = ReadReaderFromFile("READER.DAT");
        OpenFileToRead(fileName);
        ArrayList<BookReaderManagement> brms = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            BookReaderManagement bookReaderManagement = createBRMFromData(data, books, readers);
            brms.add(bookReaderManagement);
        }
        CloseFileAfterRead();
        return brms;
    }

    private BookReaderManagement createBRMFromData(String data, ArrayList<Book> books, ArrayList<Reader> readers) {
        String[] datas = data.split("\\|");
        Book book = getBook(books, Integer.parseInt(datas[0]));
        BookReaderManagement brm = new BookReaderManagement(book,
                getReader(readers, Integer.parseInt(datas[1])),
                Integer.parseInt(datas[2]), datas[3], Integer.parseInt(datas[4]), datas[5]);
        return brm;
    }

    public void UpdateBookFile(ArrayList<Book> books, String fileName){
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Book book : books) {
            printWriter.println(book.getBookID() + "|" + book.getBookName() + "|" + book.getAuthor() + "|" +
                    book.getSpecialization() + "|" + book.getPublishYear() + "|" + book.getQuantity());
        }
        CloseFileAfterWrite();
    }

    public void UpdateReaderFile(ArrayList<Reader> readers, String fileName){
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (Reader reader : readers) {
            printWriter.println(reader.getReaderID() + "|" + reader.getFullName() + "|" + reader.getAddress() + "|" +
                    reader.getPhoneNumber());
        }
        CloseFileAfterWrite();
    }

    public void UpdateBRMtoFile(ArrayList<BookReaderManagement> brms, String fileName){
        File file = new File(fileName);
        if (file.exists()){
            file.delete();
        }
        OpenFileToWrite(fileName);
        for (BookReaderManagement brm : brms) {
            printWriter.println(brm.getBook().getBookID() + "|" + brm.getReader().getReaderID() + "|" +
                    brm.getNumOfBorrow() + "|" + brm.getStatus() +
                    "|" + brm.getTotalBorrow() + "|" + brm.getDateTime());
        }
        CloseFileAfterWrite();
    }

    private static Reader getReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID() == readerID){
                return readers.get(i);
            }
        }
        return null;
    }

    private static Book getBook(ArrayList<Book> books, int bookID) {
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getBookID() == bookID){
                return books.get(i);
            }
        }
        return null;
    }
}
