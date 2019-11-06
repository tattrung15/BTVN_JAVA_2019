/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Knight knight = new Knight();
        String ten;
        int mau, nangluong;
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập máu: ");
        mau = scanner.nextInt();
        System.out.print("Nhập năng lượng: ");
        nangluong = scanner.nextInt();
        knight.setName(ten);
        knight.setHP(mau);
        knight.setMP(nangluong);
        knight.Heal();
        knight.thongso();
    }
}
