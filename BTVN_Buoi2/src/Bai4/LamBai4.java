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
public class LamBai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập số thực m: ");
        double m = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập xâu kí tự: ");
        String s = scanner.nextLine();
        System.out.println("Hai số vừa nhập là: " + n + " và " + m);
        System.out.println("Xâu kí tự vừa nhập là: " + s);
    }
}
