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
public class RunMain {
    public static void main(String[] args) {
        Person SonNghien = new Person();
        Person TuBueDe = new Person();
        SonNghien.setName("Sơn");
        SonNghien.setAge(20);
        SonNghien.setHobby("Không biết");
        SonNghien.setSex("Nam");
        TuBueDe.setName("Tú 3D");
        TuBueDe.setAge(20);
        TuBueDe.setHobby("Nhặt xà phòng");
        TuBueDe.setSex("Không xác định");
        System.out.println(SonNghien);
        System.out.println(TuBueDe);
    }
}
