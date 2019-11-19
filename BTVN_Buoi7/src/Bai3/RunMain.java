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
public class RunMain {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        lopHoc.nhap();
        lopHoc.xuat();
        int count = 0;
        for (SinhVien sinhVien : lopHoc.getSinhViens()) {
            if (sinhVien.getKhoaHoc() == 11) {
                count++;
            }
        }
        System.out.println("Có " + count + " sinh viên khóa 11");
        for (int i = 0; i < lopHoc.getSinhViens().length - 1; i++) {
            for (int j = lopHoc.getSinhViens().length - 1; j > i; j--) {
                SinhVien svBefore = lopHoc.getSinhViens()[j - 1];
                SinhVien svAfter = lopHoc.getSinhViens()[j];
                if (svBefore.getKhoaHoc() > svAfter.getKhoaHoc()) {
                    SinhVien svTemp = svAfter;
                    lopHoc.getSinhViens()[j] = svBefore;
                    lopHoc.getSinhViens()[j - 1] = svTemp;
                }
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Sau khi sắp xếp danh sách sinh viên<<<<<<<<<<<<<<<<<<<<<<<<<");
        lopHoc.xuat();
    }
}
