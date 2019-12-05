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
public class RunMain {
    public static void main(String[] args) {
        HienThiHam(4, 2, 7);
    }
    
    static int TinhTong(int a, int b, int c){
        return a + b + c;
    }
    
    static double TinhTheoCongThuc(int a, int b, int c){
        return (( (double) a / b)-c)/2;
    }
    
    static String ChuyenThanhString(int a, int b, int c){
        String s = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        return s;
    }
    
    static void HienThiHam(int a, int b, int c){
        System.out.println("Tinh Tong: " + TinhTong(a, b, c));
        System.out.println("Tinh Theo Cong Thuc: " + TinhTheoCongThuc(a, b, c));
        System.out.println("Chuyen Thanh String: " + ChuyenThanhString(a, b, c));
    }
}
