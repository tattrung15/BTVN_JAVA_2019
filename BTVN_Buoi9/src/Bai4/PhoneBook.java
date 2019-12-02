/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class PhoneBook extends CustomerPhone{
    
    private ArrayList<CustomerPhone> phoneBook;
    Scanner scanner = new Scanner(System.in);

    public PhoneBook() {
        this.phoneBook = new ArrayList<>();
    }

    public PhoneBook(ArrayList<CustomerPhone> phoneBook) {
        this.phoneBook = phoneBook;
    }
    
    public void AddCustomerPhone(CustomerPhone customerPhone){
        phoneBook.add(customerPhone);
    }
    
    public ArrayList<CustomerPhone> SearchByName(String name){
        ArrayList<CustomerPhone> customerPhones = new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equalsIgnoreCase(name)) {
                customerPhones.add(phoneBook.get(i));
            }
        }
        return customerPhones;
    }
    
    public void ShowCustomerPhoneBookByName(){
        System.out.println("Nhập tên cần tìm kiếm: ");
        String name = scanner.nextLine();
        ArrayList<CustomerPhone> customerPhones = SearchByName(name);
        System.out.println("------------------------Customer Phone Book By Name: " + name + "------------------------");
        if (customerPhones != null) {
            for (CustomerPhone customerPhone : customerPhones) {
                System.out.println(customerPhone);
            }
        }
    }
    
    public ArrayList<CustomerPhone> SearchByAge(int age1, int age2){
        ArrayList<CustomerPhone> customerPhones = new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getAge() >= age1 && phoneBook.get(i).getAge() <= age2) {
                customerPhones.add(phoneBook.get(i));
            }
        }
        return customerPhones;
    }
    
    public void ShowCustomerPhoneBookByAge(){
        System.out.println("Nhập mốc tuổi 1: ");
        int age1 = scanner.nextInt();
        System.out.println("Nhập mốc tuổi 2: ");
        int age2 = scanner.nextInt();
        ArrayList<CustomerPhone> customerPhones = SearchByAge(age1, age2);
        System.out.println("------------------------Customer Phone Book By Age: " + age1 + " -> " + age2 + "------------------------");
        if (customerPhones != null) {
            for (CustomerPhone customerPhone : customerPhones) {
                System.out.println(customerPhone);
            }
        }
    }
    
    public void ShowAllPhoneBook(){
        System.out.println("------------------------All Phone Book: ------------------------");
        if (phoneBook != null) {
            for (CustomerPhone customerPhone : phoneBook) {
                System.out.println(customerPhone);
            }
        }
    }
}
