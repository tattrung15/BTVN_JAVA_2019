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
        System.out.print("Nhap so luong ky su: ");
        int n = scanner.nextInt();
        Kysu[]kysus = new Kysu[n];
        System.out.println("--------------------Nhap ky su--------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ky su thu " + (i + 1) + ":");
            kysus[i] = new Kysu();
            kysus[i].nhap();
        }
        System.out.println("--------------------Cac ky su--------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("Ky su thu " + (i + 1) + ":");
            kysus[i].xuat();
        }
        int max = kysus[0].namTN;
        for (int i = 1; i < n; i++) {
            if (kysus[i].namTN > max) {
                max = kysus[i].namTN;
            }
        }
        System.out.println("--------------------Cac ky su tot nghiep gan nhat--------------------");
        for (Kysu kysu : kysus) {
            if (kysu.namTN == max) {
                System.out.println(kysu);
            }
        }
    }
}
