package PhoneManager;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;
        do {
            System.out.println("-----------------------------MENU-----------------------------");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Show Phones");
            System.out.println("0. Exit");

            System.out.println("Your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    scanner.nextLine();
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    phoneBook.InsertPhone(name, phone);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Nhập tên cần xóa: ");
                    String nameRemove = scanner.nextLine();
                    phoneBook.RemovePhone(nameRemove);
                    break;
                case 3:
                    ShowPhones(phoneBook.phoneList);
                    break;
            }

        } while (choice != 0);
    }

    public static void ShowPhones(ArrayList<Person> phoneList){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~PHONE LIST~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Person p : phoneList) {
            System.out.println(p);
        }
    }
}
