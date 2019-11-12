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
public class Member {
    private String ten;
    private int ngayHoatDong;
    private int soNgayNghi;

    public Member() {
    }

    public Member(String ten, int ngayHoatDong, int soNgayNghi) {
        this.ten = ten;
        this.ngayHoatDong = ngayHoatDong;
        this.soNgayNghi = soNgayNghi;
    }
    
    public void ShowInfo(){
        System.out.println("\nTên: " + ten);
        System.out.println("Ngày hoạt động: " + ngayHoatDong);
        System.out.println("Số ngày nghỉ trong lớp: " + soNgayNghi);
    }
}
