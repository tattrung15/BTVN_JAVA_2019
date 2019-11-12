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
public class Leader {
    private String ten;
    private int tuoi;
    private int soNgayLanhDao;

    public Leader() {
    }

    public Leader(String ten, int tuoi, int soNgayLanhDao) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soNgayLanhDao = soNgayLanhDao;
    }
    
    public void ShowInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Số ngày lãnh đạo: " + soNgayLanhDao);
    }
}
