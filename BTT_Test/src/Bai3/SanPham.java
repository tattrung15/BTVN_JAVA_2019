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
public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;
    
    public void InputSP(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSP = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
    }
    
    public void OutputSP(){
        System.out.println("Mã sản phẩm: " + maSP);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
    
}
