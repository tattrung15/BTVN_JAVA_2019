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
public class Support {
    private String ten;
    private int tuoi;
    private String[] tenCacTV;

    public Support() {
    }

    public Support(String ten, int tuoi, String[] tenCacTV) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.tenCacTV = tenCacTV;
    }
    
    public void ShowInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.print("Tên các thành viên trong nhóm: ");
        for (int i = 0; i < tenCacTV.length; i++) {
            System.out.print(" " + tenCacTV[i]);
        }
    }
}
