/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai10;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Giải pt: ax^2 + bx + c = 0");
        System.out.println("Nhập a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        c = scanner.nextDouble();
        double d = b*b - 4*a*c;
        if (a != 0) {
            if (d == 0) {
                System.out.println("Phương trình có nghiệm x = " + (-b/(2*a)));
            }
            if (d < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            if (d > 0) {
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("x1 = " + ((-b + Math.sqrt(d))/2*a));
                System.out.println("x2 = " + ((-b - Math.sqrt(d))/2*a));
            }
        } else {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }
}
