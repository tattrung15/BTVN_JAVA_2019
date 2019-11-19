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
public class SinhVien extends Nguoi{
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien() {
    }

    public SinhVien(String maSV, String nganh, int khoaHoc) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(String maSV, String nganh, int khoaHoc, String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();
        System.out.print("Nhập ngành học: ");
        nganh = scanner.nextLine();
        System.out.print("Nhập khóa học: ");
        khoaHoc = scanner.nextInt();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Khóa học: " + khoaHoc);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
