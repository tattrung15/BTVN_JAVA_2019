/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, m1;
        double n2, m2;
        System.out.println("Nhập số nguyên n1: ");
        n1 = scanner.nextInt();
        System.out.println("Nhập số nguyên m1: ");
        m1 = scanner.nextInt();
        System.out.println("Nhập số thực n2: ");
        n2 = scanner.nextDouble();
        System.out.println("Nhập số thực m2: ");
        m2 = scanner.nextDouble();
        System.out.println("Tổng 2 số nguyên là: " + (n1 + m1));
        System.out.println("Tổng 2 số thực là: " + (n2 + m2));
        System.out.println("Tổng 2 số n1 + n2 là: " + (n1 + n2));
    }
}
