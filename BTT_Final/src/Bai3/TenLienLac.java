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
public class TenLienLac {
    private String ma;
    private String ten;
    private String soDienThoai;

    public TenLienLac() {
    }

    public TenLienLac(String ma, String ten, String soDienThoai) {
        this.ma = ma;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "TenLienLac{" + "ma=" + ma + ", ten=" + ten + ", soDienThoai=" + soDienThoai + '}';
    }
}
