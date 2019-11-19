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
public class Moto extends Vehicle{
    private int phanKhoi;

    public Moto() {
    }

    public Moto(int phanKhoi, String nhanHieu, int namSX, String hang) {
        super(nhanHieu, namSX, hang);
        this.phanKhoi = phanKhoi;
    }

    public int getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(int phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    @Override
    public String toString() {
        return "Moto{" + "nhanHieu=" + "\"" + this.getNhanHieu() + "\"" + ", namSX=" + this.getNamSX()
                + ", hang=" + "\"" + this.getHang() + "\"" + ", phanKhoi=" + phanKhoi + '}';
    }
}
