/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class LamBai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int check = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(a[i - 1] < a[i]){
                check++;
            }
            if(check == 2){
                System.out.println(a[i - 1]);
                break;
            }
        }
    }
}
