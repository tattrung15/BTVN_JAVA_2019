/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Tat Trung
 */
public class Hacker {
    private String ten;
    private int namSinh;
    private String diaChi;
    private String soThich;
    
    public void HienThiThongTin(){
        System.out.println("Tên: " + ten);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Sở thích: " + soThich);
    }

    public Hacker() {
    }

    public Hacker(String ten, int namSinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public Hacker(String ten, int namSinh, String diaChi, String soThich) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.soThich = soThich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    @Override
    public String toString() {
        return "Hacker{" + "ten=" + ten + ", namSinh=" + namSinh + ", diaChi=" + diaChi + ", soThich=" + soThich + '}';
    }
}
