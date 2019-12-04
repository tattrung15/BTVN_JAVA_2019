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
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int soTien = 0;
        if (n <= 0) {
            System.out.println("Số điện không âm");
            System.exit(0);
        }
        if (n <= 50) {
            soTien = n*4000;
        } else if (n <= 100) {
            soTien = 50*4000 + (n - 50)*3000;
        } else {
            int s = 0, soTienGiam = 0;
            for (int i = 1; i <= n - 100; i++) {
                s += 10;
                long hieu = 3000 - s;
                if (hieu > 0) {
                    soTienGiam += hieu;
                }
            }
            soTien = (50*4000 + 50*3000) + soTienGiam;
        }
        System.out.println("Số tiền: " + soTien);
    }
}
