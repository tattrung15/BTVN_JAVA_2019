package view;

import controller.DataController;
import model.Book;
import model.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        String bookFileName = "BOOK.DAT";
        String readerFileName = "READER.DAT";
        String brmFileName = "BRM.DAT";
        DataController dataController = new DataController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------MENU----------------------------------------");
            System.out.println("1. Add book");
            System.out.println("2. Show all books");
            System.out.println("3. Edit book");
            System.out.println("4. Add reader");
            System.out.println("5. Show all readers");
            System.out.println("6. Edit reader");
            System.out.println("0. Exit");

            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    ArrayList<Book> booksExist = dataController.ReadBookFromFile(bookFileName);
                    String bookID, bookName, author, specialization;
                    int publishYear, quantity;
                    scanner.nextLine();
                    int checkExistsBook;
                    do {
                        System.out.println("Nhập mã sách: ");
                        bookID = scanner.nextLine();

                        checkExistsBook = GetIndexBook(booksExist, bookID);
                        if (checkExistsBook != -1){
                            System.out.println("Mã sách đã tồn tại");
                        } else {
                            break;
                        }
                    }while (true);
                    System.out.println("Nhập tên sách: ");
                    bookName = scanner.nextLine();
                    System.out.println("Nhập tác giả: ");
                    author = scanner.nextLine();
                    String[] spec = {"Science", "Art", "Economic", "IT"};
                    int specChoice;
                    System.out.println("Chọn thể loại sách: ");
                    do {
                        System.out.println("1. Science");
                        System.out.println("2. Art");
                        System.out.println("3. Economic");
                        System.out.println("4. IT");

                        System.out.println("Your choice: ");
                        specChoice = scanner.nextInt();
                    }while (specChoice <= 0 || specChoice >= 5);
                    specialization = spec[specChoice - 1];
                    System.out.println("Nhập năm xuất bản: ");
                    publishYear = scanner.nextInt();
                    System.out.println("Nhập số lượng: ");
                    quantity = scanner.nextInt();
                    Book book = new Book(bookID, bookName, author, specialization, publishYear, quantity);
                    dataController.WriteBookToFile(bookFileName, book);
                    break;
                case 2:
                    ShowAllBooks(dataController, bookFileName);
                    break;
                case 3:
                    scanner.nextLine();
                    ArrayList<Book> books = dataController.ReadBookFromFile(bookFileName);
                    String bookIDEdit;

                    int indexEditBook;
                    do {
                        ShowAllBooks(dataController, bookFileName);
                        System.out.println("Nhập mã sách cần sửa: ");
                        bookIDEdit = scanner.nextLine();
                        indexEditBook = GetIndexBook(books, bookIDEdit);
                        if (indexEditBook != -1){
                            break;
                        }
                    }while (true);

                    String bookNameEdit, authorEdit, specializationEdit;
                    int publishYearEdit, quantityEdit;

                    int choiceEditBook;

                    do {
                        System.out.println("1. Sửa tên sách");
                        System.out.println("2. Sửa tác giả");
                        System.out.println("3. Sửa thể loại");
                        System.out.println("4. Sửa năm xuất bản");
                        System.out.println("5. Sửa số lượng");

                        System.out.println("Your choice: ");
                        choiceEditBook = scanner.nextInt();
                    }while (choiceEditBook <= 0 || choiceEditBook >= 6);
                    scanner.nextLine();
                    switch (choiceEditBook){
                        case 1:
                            System.out.println("Nhập tên sách cần sửa: ");
                            bookNameEdit = scanner.nextLine();
                            books.get(indexEditBook).setBookName(bookNameEdit);
                            break;
                        case 2:
                            System.out.println("Nhập tên tác giả cần sửa: ");
                            authorEdit = scanner.nextLine();
                            books.get(indexEditBook).setAuthor(authorEdit);
                            break;
                        case 3:
                            int specChoiceEdit;
                            String[] specEdit = {"Science", "Art", "Economic", "IT"};
                            System.out.println("Chọn thể loại sách cần sửa: ");
                            do {
                                System.out.println("1. Science");
                                System.out.println("2. Art");
                                System.out.println("3. Economic");
                                System.out.println("4. IT");

                                System.out.println("Your choice to edit: ");
                                specChoiceEdit = scanner.nextInt();
                            }while (specChoiceEdit <= 0 || specChoiceEdit >= 5);
                            specializationEdit = specEdit[specChoiceEdit - 1];
                            books.get(indexEditBook).setSpecialization(specializationEdit);
                            break;
                        case 4:
                            System.out.println("Nhập năm xuất bản cần sửa: ");
                            publishYearEdit = scanner.nextInt();
                            books.get(indexEditBook).setPublishYear(publishYearEdit);
                            break;
                        case 5:
                            System.out.println("Nhập số lượng cần sửa: ");
                            quantityEdit = scanner.nextInt();
                            books.get(indexEditBook).setQuantity(quantityEdit);
                            break;
                    }
                    dataController.UpdateBookFile(books, bookFileName);
                    break;
                case 4:
                    ArrayList<Reader> readersExist = dataController.ReadReaderFromFile(readerFileName);
                    scanner.nextLine();
                    String readerID, fullName, address, phoneNumber;
                    int checkExistsReader;
                    do {
                        System.out.println("Nhập mã người đọc: ");
                        readerID = scanner.nextLine();

                        checkExistsReader = GetIndexReader(readersExist, readerID);
                        if (checkExistsReader != -1){
                            System.out.println("Mã người đọc đã tồn tại");
                        } else {
                            break;
                        }
                    }while (true);
                    System.out.println("Nhập mã người đọc: ");
                    readerID = scanner.nextLine();
                    System.out.println("Nhập học tên người đọc: ");
                    fullName = scanner.nextLine();
                    System.out.println("Nhập địa chỉ người đọc: ");
                    address = scanner.nextLine();
                    System.out.println("Nhập số điện thoại người đọc: ");
                    phoneNumber = scanner.nextLine();
                    Reader reader = new Reader(readerID, fullName, address, phoneNumber);
                    dataController.WtriteReaderToFile(readerFileName, reader);
                    break;
                case 5:
                    ShowAllReaders(dataController, readerFileName);
                    break;
                case 6:
                    scanner.nextLine();
                    ArrayList<Reader> readers = dataController.ReadReaderFromFile(readerFileName);
                    String readerIDEdit;

                    int indexEditReader;
                    do {
                        ShowAllReaders(dataController, readerFileName);
                        System.out.println("Nhập mã người đọc cần sửa: ");
                        readerIDEdit = scanner.nextLine();
                        indexEditReader = GetIndexReader(readers, readerIDEdit);
                        if (indexEditReader != -1){
                            break;
                        }
                    }while (true);

                    String fullNameEdit, addressEdit, phoneNumberEdit;

                    int choiceEditReader;
                    do {
                        System.out.println("1. Sửa họ tên");
                        System.out.println("2. Sửa địa chỉ");
                        System.out.println("3. Sửa số điện thoại");

                        System.out.println("Your choice edit: ");
                        choiceEditReader = scanner.nextInt();
                    }while (choiceEditReader <= 0 || choiceEditReader >= 4);
                    scanner.nextLine();
                    switch(choiceEditReader){
                        case 1:
                            System.out.println("Nhập họ tên muốn sửa: ");
                            fullNameEdit = scanner.nextLine();
                            readers.get(indexEditReader).setFullName(fullNameEdit);
                            break;
                        case 2:
                            System.out.println("Nhập địa chỉ muốn sửa: ");
                            addressEdit = scanner.nextLine();
                            readers.get(indexEditReader).setAddress(addressEdit);
                            break;
                        case 3:
                            System.out.println("Nhập số điện thoại muốn sửa: ");
                            phoneNumberEdit = scanner.nextLine();
                            readers.get(indexEditReader).setPhoneNumber(phoneNumberEdit);
                            break;
                    }
                    dataController.UpdateReaderFile(readers, readerFileName);
                    break;
            }

        }while (choice != 0);
    }

    private static int GetIndexBook(ArrayList<Book> books, String bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID().equalsIgnoreCase(bookID)){
                return i;
            }
        }
        return -1;
    }

    private static int GetIndexReader(ArrayList<Reader> readers, String readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID().equalsIgnoreCase(readerID)){
                return i;
            }
        }
        return -1;
    }

    private static void ShowAllReaders(DataController dataController, String readerFileName) {
        ArrayList<Reader> readers = dataController.ReadReaderFromFile(readerFileName);
        for (Reader reader: readers) {
            System.out.println(reader);
        }
    }

    public static void ShowAllBooks(DataController dataController, String fileName){
        ArrayList<Book> books = dataController.ReadBookFromFile(fileName);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
