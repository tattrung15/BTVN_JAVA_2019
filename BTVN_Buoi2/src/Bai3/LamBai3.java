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
public class LamBai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Nhập số thực m: ");
        double m = scanner.nextDouble();
        System.out.println("Hai số vừa nhập là: " + n + " và " + m);
    }
}
