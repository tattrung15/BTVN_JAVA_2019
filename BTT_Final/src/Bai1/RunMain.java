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
public class RunMain {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("GSDA23", "AbcXyz1", "nhan vien");
        NhanVien nhanVien2 = new NhanVien("SDI34", "AbcXyz2", "truong phong");
        NhanVien nhanVien3 = new NhanVien("SJDN92", "AbcXyz3", "giam doc");
        NhanVien nhanVien4 = new NhanVien("SDJH124", "AbcXyz4", "chu tich");
        nhanVien1.TinhLuong();
        nhanVien2.TinhLuong();
        nhanVien3.TinhLuong();
        nhanVien4.TinhLuong();
        System.out.println(nhanVien1);
        System.out.println(nhanVien2);
        System.out.println(nhanVien3);
        System.out.println(nhanVien4);
    }
}
