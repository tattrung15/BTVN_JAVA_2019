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
                brm.getNumOfBorrow() + "|" + brm.getState() + "|" + brm.getTotalBorrow());
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
        Reader reader = new Reader(datas[0], datas[1], datas[2], datas[3]);
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
        Book book = new Book(datas[0], datas[1], datas[2], datas[3],
                Integer.parseInt(datas[4]), Integer.parseInt(datas[5]));
        return book;
    }

    public ArrayList<BookReaderManagement> ReadBRMFromFile(String fileName){
        ArrayList<Book> books = ReadBookFromFile(fileName);
        ArrayList<Reader> readers = ReadReaderFromFile(fileName);
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
        BookReaderManagement brm = new BookReaderManagement(getBook(books, datas[0]), getReader(readers, datas[1]),
                Integer.parseInt(datas[2]), datas[3], Integer.parseInt(datas[4]));
        return null;
    }

    private Reader getReader(ArrayList<Reader> readers, String readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID().equals(readerID)){
                return readers.get(i);
            }
        }
        return null;
    }

    private Book getBook(ArrayList<Book> books, String bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID().equals(bookID)){
                return books.get(i);
            }
        }
        return null;
    }
}
