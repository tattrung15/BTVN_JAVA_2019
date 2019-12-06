/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Tat Trung
 */
public class ToTien {
    private String maToTien;
    private String loaiTien;

    public ToTien() {
    }

    public ToTien(String maToTien, String loaiTien) {
        this.maToTien = maToTien;
        this.loaiTien = loaiTien;
    }
    
    public boolean KiemTraChiaHet(){
        int sMaTien = 0;
        int sLoaiTien = 0;
        for (int i = 0; i < maToTien.length(); i++) {
            if (maToTien.charAt(i) >= '0' && maToTien.charAt(i) <= '9') {
                sMaTien += Integer.parseInt(Character.toString(maToTien.charAt(i)));
            }
        }
        for (int i = 0; i < loaiTien.length(); i++) {
            if (loaiTien.charAt(i) >= '0' && loaiTien.charAt(i) <= '9') {
                sLoaiTien += Integer.parseInt(Character.toString(loaiTien.charAt(i)));
            }
        }
        if (sMaTien % sLoaiTien == 0) {
            return true;
        }
        return false;
    }

    public String getMaToTien() {
        return maToTien;
    }

    public void setMaToTien(String maToTien) {
        this.maToTien = maToTien;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public String toString() {
        return "ToTien{" + "maToTien=" + maToTien + ", loaiTien=" + loaiTien + '}';
    }
}
