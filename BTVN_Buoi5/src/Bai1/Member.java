/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class Member {
    private String maSV;
    private String ten;
    private String tuoi;
    private String lop;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();
        System.out.print("Nhập tên: ");
        ten = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }
    
    @Override
    public String toString() {
        return "Member{" + "maSV=" + maSV + ", ten=" + ten + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
    
    
}
