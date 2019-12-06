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
public class NhanVien {
    private String maNV;
    private String tenNV;
    private String chucVu;
    private int luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String chucVu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
    }
    
    public void TinhLuong(){
        if (getChucVu().equals("nhan vien")) {
            this.setLuong(5000000);
        } else if (getChucVu().equals("truong phong")) {
            this.setLuong(8000000);
        } else if (getChucVu().equals("giam doc")) {
            this.setLuong(10000000);
        } else {
            this.setLuong(0);
        }
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", chucVu=" + chucVu + ", luong=" + luong + '}';
    }
}
