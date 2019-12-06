/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TenLienLac tenLienLac1 = new TenLienLac("asd123", "qwe", "0923986123");
        TenLienLac tenLienLac2 = new TenLienLac("asd124", "rty", "0734823146");
        TenLienLac tenLienLac3 = new TenLienLac("asd125", "uio", "0162426393");
        TenLienLac tenLienLac4 = new TenLienLac("asd126", "jkl", "0523462374");
        TenLienLac tenLienLac5 = new TenLienLac("asd127", "zxc", "0718764172");
        SoLienLac soLienLac = new SoLienLac();
        soLienLac.ThemTenLienLac(tenLienLac1);
        soLienLac.ThemTenLienLac(tenLienLac2);
        soLienLac.ThemTenLienLac(tenLienLac3);
        soLienLac.ThemTenLienLac(tenLienLac4);
        soLienLac.ThemTenLienLac(tenLienLac5);
        int choice;
        do {
            System.out.println("1. Hiển thị thông tin liên lạc bằng id");
            System.out.println("2. Sửa thông tin liên lạc");
            System.out.println("3. Xóa tên liên lạc");
            System.out.println("4. Hiển thị tất cả sổ liên lạc");
            System.out.println("5. Thoát");
            
            System.out.println("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Nhập id cần tìm kiếm: ");
                    String id = scanner.nextLine();
                    soLienLac.HienThiThongTinBangID(id);
                    break;
                case 2:
                    System.out.println("Nhập id cần sửa: ");
                    String idSua = scanner.nextLine();
                    soLienLac.SuaThongTinBangID(idSua);
                    break;
                case 3:
                    System.out.println("Nhập id xóa: ");
                    String idXoa = scanner.nextLine();
                    soLienLac.XoaThongTinBangID(idXoa);
                    break;
                case 4:
                    soLienLac.HienThiToanBoThongTin();
                    break;
                case 5:
                    break;
            }
            
        } while (choice != 5);
    }
}
