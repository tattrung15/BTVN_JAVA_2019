package view;

import controller.DataController;
import model.Book;

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
            System.out.println("0. Exit");

            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    break;
                case 1:
                    String bookID, bookName, author, specialization;
                    int publishYear, quantity;
                    scanner.nextLine();
                    System.out.println("Nhập mã sách: ");
                    bookID = scanner.nextLine();
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
                    ArrayList<Book> books = dataController.ReadBookFromFile(bookFileName);
                    for (Book b : books) {
                        System.out.println(b);
                    }
                    break;
            }

        }while (choice != 0);
    }
}
