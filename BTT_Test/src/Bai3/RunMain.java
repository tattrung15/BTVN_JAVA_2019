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
        Phieu phieu = new Phieu();
        phieu.InputPhieu();
        System.out.println("--------------------Phiếu vừa nhập: --------------------");
        phieu.OutputPhieu();
        double thanhtien = 0;
        for(int i = 0; i < phieu.getN(); i++){
            thanhtien += phieu.getX()[i].getDonGia() * phieu.getX()[i].getSoLuong();
        }
        System.out.println("Thành tiền: " + thanhtien);
    }
}
