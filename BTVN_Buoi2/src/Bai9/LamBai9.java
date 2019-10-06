/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Giải pt: ax + b = 0");
        System.out.println("Nhập a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("x = " + (-b/a));
        }
    }
}
