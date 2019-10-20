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
        Dog a = new Dog();
        System.out.print("Nhập tên: ");
        a.InputName(scanner.nextLine());
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
    }
}
