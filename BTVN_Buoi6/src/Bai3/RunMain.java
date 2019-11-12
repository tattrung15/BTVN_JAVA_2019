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
        String[] ten = {"Trung", "Thắng"};
        CauLacBo clb = new CauLacBo(new Leader("A Sơn", 20, 345), new Support("A Tú", 20, ten), new Member("Doan", 50, 10));
        clb.ShowInfo();
    }
}
