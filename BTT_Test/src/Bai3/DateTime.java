/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class DateTime {
    private int ngay;
    private int thang;
    private int nam;
    
    public void InputDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        ngay = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        thang = scanner.nextInt();
        System.out.print("Nhập năm: ");
        nam = scanner.nextInt();
    }
    
    public void OutputDate(){
        System.out.println("Ngày: " + ngay);
        System.out.println("Tháng: " + thang);
        System.out.println("Năm: " + nam);
    }
    
}
