package view;

import controller.DataController;
import controller.DataUtility;
import model.Book;
import model.BookReaderManagement;
import model.Reader;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        String bookFileName = "BOOK.DAT";
        String readerFileName = "READER.DAT";
        String brmFileName = "BRM.DAT";

        DataController dataController = new DataController();
        DataUtility dataUtility = new DataUtility();

        ArrayList<Book> books;
        ArrayList<Reader> readers;
        ArrayList<BookReaderManagement> brms;

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------------------------MENU----------------------------------------");
            System.out.println("1. Add book");
            System.out.println("2. Show all book");
            System.out.println("3. Edit book");
            System.out.println("4. Add reader");
            System.out.println("5. Show all reader");
            System.out.println("6. Edit reader");
            System.out.println("7. Delete book");
            System.out.println("8. Delete reader");
            System.out.println("9. Create management information borrow");
            System.out.println("10. Show all management information borrow");
            System.out.println("11. Sort all book");
            System.out.println("12. Sort all reader");
            System.out.println("13. Sort all management information borrow");
            System.out.println("0. Exit");

            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    books = dataController.ReadBookFromFile(bookFileName);
                    String bookName, author, specialization;
                    String regexBookID = "^\\d{8,}$";
                    int bookIDAdd, publishYear, quantity, checkExistsBook;
                    do {
                        System.out.println("Nhập mã sách: ");
                        bookIDAdd = scanner.nextInt();

                        checkExistsBook = GetIndexBook(books, bookIDAdd);

                        if(String.valueOf(bookIDAdd).matches(regexBookID)){
                            if (checkExistsBook != -1){
                                System.out.println("Mã sách đã tồn tại");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Mã sách tối thiểu 8 kí tự");
                        }

                    }while (true);
                    scanner.nextLine();
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
                    Book book = new Book(bookIDAdd, bookName, author, specialization, publishYear, quantity);
                    dataController.WriteBookToFile(bookFileName, book);
                    break;
                case 2:
                    ShowAllBook(dataController, bookFileName);
                    break;
                case 3:
                    books = dataController.ReadBookFromFile(bookFileName);
                    int bookIDEdit;

                    int indexEditBook;
                    do {
                        ShowAllBook(dataController, bookFileName);
                        System.out.println("Nhập mã sách cần sửa: ");
                        bookIDEdit = scanner.nextInt();
                        indexEditBook = GetIndexBook(books, bookIDEdit);
                        if (indexEditBook != -1){
                            break;
                        } else {
                            System.out.println("Mã sách không tồn tại");
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
                    readers = dataController.ReadReaderFromFile(readerFileName);
                    int readerIDAdd;
                    String fullName, address, phoneNumber;
                    String regexReaderID = "^\\d{6,}$";
                    int checkExistsReader;
                    do {
                        System.out.println("Nhập mã người đọc: ");
                        readerIDAdd = scanner.nextInt();

                        checkExistsReader = GetIndexReader(readers, readerIDAdd);

                        if(String.valueOf(readerIDAdd).matches(regexReaderID)){
                            if (checkExistsReader != -1){
                                System.out.println("Mã người đọc đã tồn tại");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Mã người đọc tối thiểu 6 kí tự");
                        }
                    }while (true);
                    scanner.nextLine();
                    System.out.println("Nhập học tên người đọc: ");
                    fullName = scanner.nextLine();
                    System.out.println("Nhập địa chỉ người đọc: ");
                    address = scanner.nextLine();
                    System.out.println("Nhập số điện thoại người đọc: ");
                    phoneNumber = scanner.nextLine();

                    Reader reader = new Reader(readerIDAdd, fullName, address, phoneNumber);
                    dataController.WtriteReaderToFile(readerFileName, reader);
                    break;
                case 5:
                    ShowAllReader(dataController, readerFileName);
                    break;
                case 6:
                    readers = dataController.ReadReaderFromFile(readerFileName);
                    int readerIDEdit;

                    int indexEditReader;
                    do {
                        ShowAllReader(dataController, readerFileName);
                        System.out.println("Nhập mã người đọc cần sửa: ");
                        readerIDEdit = scanner.nextInt();
                        indexEditReader = GetIndexReader(readers, readerIDEdit);
                        if (indexEditReader != -1){
                            break;
                        } else {
                            System.out.println("Mã người đọc không tồn tại");
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
                case 7:
                    books = dataController.ReadBookFromFile(bookFileName);
                    int bookIDDelete;
                    int indexBookDelete;
                    do {
                        ShowAllBook(dataController, bookFileName);
                        System.out.println("Nhập mã sách cần xóa: ");
                        bookIDDelete = scanner.nextInt();

                        indexBookDelete = GetIndexBook(books, bookIDDelete);
                        if (indexBookDelete == -1){
                            System.out.println("Mã sách không tồn tại");
                        } else {
                            books.remove(indexBookDelete);
                            break;
                        }
                    }while (true);
                    dataController.UpdateBookFile(books, bookFileName);
                    break;
                case 8:
                    readers = dataController.ReadReaderFromFile(readerFileName);
                    int readerIDDelete;
                    int indexReaderDelete;
                    do {
                        ShowAllReader(dataController, readerFileName);
                        System.out.println("Nhập mã người đọc cần xóa: ");
                        readerIDDelete = scanner.nextInt();

                        indexReaderDelete = GetIndexReader(readers, readerIDDelete);
                        if (indexReaderDelete == -1){
                            System.out.println("Mã người đọc không tồn tại");
                        } else {
                            readers.remove(indexReaderDelete);
                            break;
                        }
                    }while (true);
                    dataController.UpdateReaderFile(readers, readerFileName);
                    break;
                case 9:
                    readers = dataController.ReadReaderFromFile(readerFileName);
                    books = dataController.ReadBookFromFile(bookFileName);
                    brms = dataController.ReadBRMFromFile(brmFileName);

                    int bookID, readerID;
                    String status;
                    boolean isBorrowable;
                    boolean isFull;
                    int checkExistReader, checkExistBook, total;

                    do {
                        ShowAllReader(dataController, readerFileName);
                        System.out.println("Nhập mã người đọc: ");
                        readerID = scanner.nextInt();

                        checkExistReader = GetIndexReader(readers, readerID);
                        isBorrowable = checkBorrowed(brms, readerID);

                        if (checkExistReader == -1){
                            System.out.println("Người đọc không tồn tại");
                        } else if (isBorrowable){
                            break;
                        } else {
                            System.out.println("Người đọc đã mượn đủ số lượng cho phép");
                        }

                    }while (true);

                    do {
                        ShowAllBook(dataController, bookFileName);
                        System.out.println("Nhập mã sách: ");
                        bookID = scanner.nextInt();

                        checkExistBook = GetIndexBook(books, bookID);
                        isFull = checkFull(brms, readerID, bookID);

                        if (checkExistBook == -1){
                            System.out.println("Sách không tồn tại");
                        }else if (isFull){
                            System.out.println("Vui lòng chọn đầu sách khác");
                        } else {
                            break;
                        }

                    }while (true);

                    total = GetTotal(brms, readerID, bookID);

                    do {
                        System.out.print("Nhập số lượng mượn, tối đa 3 cuốn ( đã mượn "+ total + " ): ");
                        int x = scanner.nextInt();
                        if ((x + total) >= 1 && (x + total) <= 3){
                            total += x;
                            break;
                        } else {
                            System.out.println("Nhập quá số lượng cho phép");
                        }
                    }while (true);
                    scanner.nextLine();

                    System.out.println("Nhập tình trạng của book: ");
                    status = scanner.nextLine();

                    Book currentBook = GetBook(books, bookID);
                    Reader currentReader = GetReader(readers, readerID);
                    BookReaderManagement brm =
                            new BookReaderManagement(currentBook, currentReader, total, status, 0);

                    brms = dataUtility.UpdateBRMInfo(brms, brm);
                    brms = dataUtility.UpdateTotalBorrow(brms);
                    dataController.UpdateBRMtoFile(brms, brmFileName);

                    break;
                case 10:
                    ShowAllBRM(dataController, brmFileName);
                    break;
                case 11:
                    books = dataController.ReadBookFromFile(bookFileName);
                    int choiceSortBook;
                    do {
                        System.out.println("1. Sắp xếp theo mã sách");
                        System.out.println("2. Sắp xếp theo tên sách");
                        choiceSortBook = scanner.nextInt();

                    }while (choiceSortBook <= 0 || choiceSortBook >= 3);
                    if (choiceSortBook == 1){
                        dataUtility.SortByID(books, 0);
                    } else {
                        dataUtility.SortByName(books, 0);
                    }
                    dataController.UpdateBookFile(books, bookFileName);
                    ShowAllBook(dataController, bookFileName);
                    break;
                case 12:
                    readers = dataController.ReadReaderFromFile(readerFileName);
                    int choiceSortReader;
                    do {
                        System.out.println("1. Sắp xếp theo mã người đọc");
                        System.out.println("2. Sắp xếp theo tên người đọc");
                        choiceSortReader = scanner.nextInt();

                    }while (choiceSortReader <= 0 || choiceSortReader >= 3);
                    if (choiceSortReader == 1){
                        dataUtility.SortByID(readers);
                    } else {
                        dataUtility.SortByName(readers);
                    }
                    dataController.UpdateReaderFile(readers, readerFileName);
                    ShowAllReader(dataController, readerFileName);
                    break;
                case 13:
                    brms = dataController.ReadBRMFromFile(brmFileName);
                    int choiceSortBRM;
                    do {
                        System.out.println("1. Sắp xếp theo tên người đọc");
                        System.out.println("2. Sắp xếp theo số lượng sách mượn (giảm dần)");
                        choiceSortBRM = scanner.nextInt();

                    }while (choiceSortBRM <= 0 || choiceSortBRM >= 3);
                    if (choiceSortBRM == 1){
                        dataUtility.SortBrmByName(brms);
                    } else {
                        dataUtility.SortBrmByTotalBorrow(brms);
                    }
                    dataController.UpdateBRMtoFile(brms, brmFileName);
                    ShowAllBRM(dataController, brmFileName);
                    break;
            }

        }while (choice != 0);
    }

    private static Reader GetReader(ArrayList<Reader> readers, int readerID) {
        for (Reader r: readers) {
            if (r.getReaderID() == readerID){
                return r;
            }
        }
        return null;
    }

    private static Book GetBook(ArrayList<Book> books, int bookID) {
        for (Book b: books) {
            if (b.getBookID() == bookID){
                return b;
            }
        }
        return null;
    }

    private static boolean checkFull(ArrayList<BookReaderManagement> brms, int readerID, int bookID) {
        for (BookReaderManagement r: brms) {
            if (r.getReader().getReaderID() == readerID &&
                    r.getBook().getBookID() == bookID && r.getNumOfBorrow() == 3){
                return true;
            }
        }
        return false;
    }

    private static int GetTotal(ArrayList<BookReaderManagement> brms, int readerID, int bookID) {
        for (BookReaderManagement r: brms) {
            if (r.getReader().getReaderID() == readerID &&
                    r.getBook().getBookID() == bookID){
                return r.getNumOfBorrow();
            }
        }
        return 0;
    }

    private static boolean checkBorrowed(ArrayList<BookReaderManagement> brms, int readerID) {
        int count = 0;
        for (BookReaderManagement r : brms) {
            if (r.getReader().getReaderID() == readerID){
                count += r.getNumOfBorrow();
            }
        }
        if (count == 15){
            return false;
        }
        return true;
    }

    private static int GetIndexBook(ArrayList<Book> books, int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookID() == bookID){
                return i;
            }
        }
        return -1;
    }

    private static int GetIndexReader(ArrayList<Reader> readers, int readerID) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getReaderID() == readerID){
                return i;
            }
        }
        return -1;
    }

    private static void ShowAllReader(DataController dataController, String readerFileName) {
        ArrayList<Reader> readers = dataController.ReadReaderFromFile(readerFileName);
        for (Reader reader: readers) {
            System.out.println(reader);
        }
    }

    public static void ShowAllBook(DataController dataController, String fileName){
        ArrayList<Book> books = dataController.ReadBookFromFile(fileName);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void ShowAllBRM(DataController dataController, String fileName){
        ArrayList<BookReaderManagement> brms = dataController.ReadBRMFromFile(fileName);
        for (BookReaderManagement r : brms) {
            System.out.println(r);
        }
    }
}
