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
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        int count = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a[count]) {
                count++;
            }
            if(count == 5){
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
