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
public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private SanPham[] x;
    private int n;
    
    public void InputPhieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        maPhieu = scanner.nextLine();
        System.out.print("Nhập tên phiếu: ");
        tenPhieu = scanner.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.print("Nhập số lượng sản phẩm: ");
        n = scanner.nextInt();
        x = new SanPham[n];
        for (int i = 0; i < n; i++) {
            x[i] = new SanPham();
            x[i].InputSP();
        }
    }
    
    public void OutputPhieu(){
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Tên phiếu: " + tenPhieu);
        for (int i = 0; i < n; i++) {
            x[i].OutputSP();
        }
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public SanPham[] getX() {
        return x;
    }

    public void setX(SanPham[] x) {
        this.x = x;
    }

    
    
    
}
