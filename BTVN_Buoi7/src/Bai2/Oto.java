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
public class Oto extends Vehicle{
    private int soChoNgoi;
    private int dungTich;

    public Oto() {
    }

    public Oto(int soChoNgoi, int dungTich, String nhanHieu, int namSX, String hang) {
        super(nhanHieu, namSX, hang);
        this.soChoNgoi = soChoNgoi;
        this.dungTich = dungTich;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return "Oto{" + "nhanHieu=" + "\"" + this.getNhanHieu() + "\"" + ", namSX=" + this.getNamSX() + ", hang=" + "\""
                + this.getHang() + "\"" + ", soChoNgoi=" + soChoNgoi + ", dungTich=" + dungTich + '}';
    }
}
