/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Tat Trung
 */
public class Cal {
    int TinhTong(int a, int b, int c){
        return a + b + c;
    }
    
    int TinhTheoCongThuc(int a, int b, int c){
        return ((a / b)-c)/2;
    }
    
    int ChuyenThanhString(int a, int b, int c){
        String s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        return Integer.valueOf(s);
    }
    
    public void HienThiHam(int a, int b, int c){
        System.out.println("Tinh Tong: " + TinhTong(a, b, c));
        System.out.println("Tinh Theo Cong Thuc: " + TinhTheoCongThuc(a, b, c));
        System.out.println("Chuyen Thanh String: " + ChuyenThanhString(a, b, c));
    }
}
