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
public class Vehicle {
    private String nhanHieu;
    private int namSX;
    private String hang;

    public Vehicle() {
    }

    public Vehicle(String nhanHieu, int namSX, String hang) {
        this.nhanHieu = nhanHieu;
        this.namSX = namSX;
        this.hang = hang;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
}
