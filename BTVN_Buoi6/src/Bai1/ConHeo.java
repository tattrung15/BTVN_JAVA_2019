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
public class ConHeo {
    private String ten;
    private double canNang;
    private int tuoi;

    public ConHeo() {
    }

    public ConHeo(String ten, double canNang, int tuoi) {
        this.ten = ten;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }
    
    public void ShowInfo(){
        System.out.println("Tên: " + ten);
        System.out.println("Cân nặng: " + canNang);
        System.out.println("Tuổi: " + tuoi);
    }
    
}
