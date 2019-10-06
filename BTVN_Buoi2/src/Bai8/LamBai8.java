/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập số c: ");
        c = scanner.nextDouble();
        System.out.println("Max: " + Math.max(a, Math.max(b, c)));
        System.out.println("Min: " + Math.min(a, Math.min(b, c)));
    }
}
