/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class SoLienLac extends TenLienLac{
    private ArrayList<TenLienLac> soLienLacs = new ArrayList<>();
    
    void ThemTenLienLac(TenLienLac tenLienLac){
        soLienLacs.add(tenLienLac);
    }
    
    TenLienLac TimKiemID(String id){
        for (int i = 0; i < soLienLacs.size(); i++) {
            if (soLienLacs.get(i).getMa().equals(id)) {
                return soLienLacs.get(i);
            }
        }
        return null;
    }
    
    void HienThiThongTinBangID(String id){
        if (TimKiemID(id) != null) {
            System.out.println(TimKiemID(id));
        } else {
            System.out.println("Không tìm thấy tên liên lạc có id: " + id);
        }
    }
    
    void SuaThongTinBangID(String id){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soLienLacs.size(); i++) {
            if (soLienLacs.get(i).getMa().equals(id)) {
                do {                    
                    System.out.println("1. Sửa tên");
                    System.out.println("2. Sửa số điện thoại");
                    System.out.println("Your choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch(choice){
                        case 1:
                            System.out.println("Nhập tên muốn sửa: ");
                            String ten = scanner.nextLine();
                            soLienLacs.get(i).setTen(ten);
                            break;
                        case 2:
                            System.out.println("Nhập số điện thoại muốn sửa: ");
                            String soDienThoai = scanner.nextLine();
                            soLienLacs.get(i).setSoDienThoai(soDienThoai);
                            break;
                    }
                    break;
                } while (true);
            }
        }
    }
    
    void XoaThongTinBangID(String id){
        for (int i = 0; i < soLienLacs.size(); i++) {
            if (soLienLacs.get(i).getMa().equals(id)) {
                soLienLacs.remove(i);
            }
        }
    }
    
    void HienThiToanBoThongTin(){
        for (int i = 0; i < soLienLacs.size(); i++) {
            System.out.println(soLienLacs.get(i));
        }
    }
}
