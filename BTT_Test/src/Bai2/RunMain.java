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
        System.out.print("Nhập số phần tử: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = scanner.nextDouble();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = n - 2; j >= i; j--){
                if(a[j] < a[j + 1]){
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sau khi sắp xếp: ");
        for(double b: a){
            System.out.print(b + " ");
        }
        int count = 0;
        System.out.println("\nCác số chính phương là: ");
        for(int i = 0; i < n; i++){
            if(Math.sqrt(a[i]) % 1 == 0){
                count++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\nSố các số chính phương là: " + count);
    }
}
