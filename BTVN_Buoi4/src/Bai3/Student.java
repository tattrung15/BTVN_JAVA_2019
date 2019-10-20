/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class Student {
    private String name;
    private String code;
    private int age;
    
    public void InputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập mã sv: ");
        code = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }
    
    public void ShowInfo(){
        System.out.println("Tên: " + name + ", mã sv: " + code + ", tuổi: " + age);
    }
}
