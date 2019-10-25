/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int tich = 1;
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
                tich *= Integer.parseInt(Character.toString(s.charAt(i)));
            }
        }
        System.out.println("Số các số: " + count);
        System.out.println("Tích các số: " + tich);
    }
}
