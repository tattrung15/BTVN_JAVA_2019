/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh();
        float a = 4.5f;
        float b = 9.43f;
        float c = 21.3f;
        float d[] = {3.5f, 2f, 1.8f, 65.3f, 3.5f};
        System.out.println("a + b = " + mayTinh.TinhTong(a, b));
        System.out.println("a + b + c = " + mayTinh.TinhTong(a, b, c));
        System.out.println("Tổng các số mảng số nguyên = " + mayTinh.TinhTong(d));
    }
}
