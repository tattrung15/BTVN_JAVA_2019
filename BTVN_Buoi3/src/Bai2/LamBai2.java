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
public class LamBai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String a = scanner.nextLine();
        int s = 0;
        for (int i = 0; i < a.length(); i++) {
            if(Character.isDigit(a.charAt(i))){
               s += Integer.parseInt(Character.toString(a.charAt(i)));
               
            }
        }
        System.out.println(s);
    }
}
