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
}
