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
public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private SinhVien[] sinhViens;
    private String giaoVien;
    private int n;

    public LopHoc() {
    }

    public LopHoc(String maLH, String tenLH, String ngayMo, SinhVien[] sinhViens, String giaoVien, int n) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.sinhViens = sinhViens;
        this.giaoVien = giaoVien;
        this.n = n;
    }
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");
        maLH = scanner.nextLine();
        System.out.print("Nhập tên lớp học: ");
        tenLH = scanner.nextLine();
        System.out.print("Nhập ngày mở: ");
        ngayMo = scanner.nextLine();
        System.out.print("Nhập giáo viên: ");
        giaoVien = scanner.nextLine();
        System.out.print("Nhập số lượng sinh viên: ");
        n = scanner.nextInt();
        sinhViens = new SinhVien[n];
        System.out.println("----------------------Nhập thông tin sinh viên----------------------");
        for (int i = 0; i < n; i++) {
            sinhViens[i] = new SinhVien();
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
            sinhViens[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("----------------------Thông tin lớp học----------------------");
        System.out.println("Mã lớp học: " + maLH);
        System.out.println("Tên lớp học: " + tenLH);
        System.out.println("Ngày mở: " + ngayMo);
        System.out.println("Giáo viên: " + giaoVien);
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            sinhViens[i].xuat();
        }
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public SinhVien[] getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(SinhVien[] sinhViens) {
        this.sinhViens = sinhViens;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
