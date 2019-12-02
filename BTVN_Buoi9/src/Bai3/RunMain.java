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
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hacker hacker1 = new Hacker();
        hacker1.setTen("xyz");
        hacker1.setNamSinh(1990);
        hacker1.setDiaChi("USA");
        hacker1.setSoThich("coding");
        System.out.println("------------------Hacker 1: ------------------");
        System.out.println("Tên: " + hacker1.getTen());
        System.out.println("Năm sinh: " + hacker1.getNamSinh());
        System.out.println("Địa chỉ: " + hacker1.getDiaChi());
        System.out.println("Sở thích: " + hacker1.getSoThich());
        Hacker hacker2 = new Hacker("abc", 1991, "VN");
        System.out.println("------------------Hacker 2: ------------------");
        hacker2.HienThiThongTin();
        System.out.println("Nhập số Hacker: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Hacker[] hackers = new Hacker[n];
        for (int i = 0; i < n; i++) {
            hackers[i] = new Hacker();
            System.out.println("Nhập hacker " + (i + 1));
            System.out.println("Nhập tên: ");
            hackers[i].setTen(scanner.nextLine());
            System.out.println("Nhập năm sinh: ");
            hackers[i].setNamSinh(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            hackers[i].setDiaChi(scanner.nextLine());
            System.out.println("Nhập sở thích: ");
            hackers[i].setSoThich(scanner.nextLine());
        }
        System.out.println("------------------Hacker có tuổi 18: ------------------");
        ShowHackerHas18Y(hackers);
        System.out.println("------------------Hacker có chữ cái đầu trong tên là T(t): ------------------");
        ShowHackerHasTName(hackers);
    }
    
    public static void ShowHackerHas18Y(Hacker[] hackers){
        for (int i = 0; i < hackers.length; i++) {
            if (hackers[i].getNamSinh() == 2001) {
                System.out.println(hackers[i]);
            }
        }
    }
    
    public static void ShowHackerHasTName(Hacker[] hackers){
        for (int i = 0; i < hackers.length; i++) {
            char kytu = hackers[i].getTen().charAt(0);
            if (kytu == 't' || kytu == 'T') {
                System.out.println(hackers[i]);
            }
        }
    }
}
