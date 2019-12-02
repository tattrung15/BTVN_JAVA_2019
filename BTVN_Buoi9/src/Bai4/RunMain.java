/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;
        do{
            System.out.println("---------------------------MENU---------------------------");
            System.out.println("1. Add customer phone");
            System.out.println("2. Show all phone book");
            System.out.println("3. Search by name");
            System.out.println("4. Search by age");
            System.out.println("0. Exit");
            
            System.out.println("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    break;
                case 1:
                    System.out.println("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    CustomerPhone customerPhone = new CustomerPhone(name, age, phone);
                    phoneBook.AddCustomerPhone(customerPhone);
                    break;
                case 2:
                    phoneBook.ShowAllPhoneBook();
                    break;
                case 3:
                    phoneBook.ShowCustomerPhoneBookByName();
                    break;
                case 4:
                    phoneBook.ShowCustomerPhoneBookByAge();
                    break;
            }
            
        }while(choice != 0);
    }
}
