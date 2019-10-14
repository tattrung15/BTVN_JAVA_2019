/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        String a = scanner.nextLine();
        System.out.print("Nhập b: ");
        String b = scanner.nextLine();
        String regex = "\\d+";
        if (a.matches(regex) == false || b.matches(regex) == false) {
            System.out.println("a hoặc b không phải là 1 số");
            System.exit(0);
        }
        BigInteger soA = new BigInteger(a);
        BigInteger soB = new BigInteger(b);
        BigInteger aAddB = soA.add(soB);
        System.out.println("Kết quả: " + aAddB);
    }
}
