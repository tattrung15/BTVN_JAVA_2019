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
        ToTien[] toTiens = new ToTien[10];
        for (int i = 0; i < 10; i++) {
            toTiens[i] = new ToTien();
        }
        toTiens[0] = new ToTien("M110A634ABG","1k");
        toTiens[1] = new ToTien("M3255LINH45","1k");
        toTiens[2] = new ToTien("M3HIEU2AS34","1k");
        toTiens[3] = new ToTien("U13HTS34E","2k");
        toTiens[4] = new ToTien("982TUXP21","2k");
        toTiens[5] = new ToTien("38HIT7734","2k");
        toTiens[6] = new ToTien("65GSONGNGHIEN2","5k");
        toTiens[7] = new ToTien("G3C5WHZ3FDE324","5k");
        toTiens[8] = new ToTien("H34ITHUTS25551","5k");
        toTiens[9] = new ToTien("C7H10OTHAI13","10k");
        
        String[] tens = {"SON", "TU", "THU", "LINH", "THAI", "HIEU"};
        System.out.println("--------------------Phần 1--------------------");
        for (int i = 0; i < 10; i++) {
            if (toTiens[i].getMaToTien().contains(tens[0]) || toTiens[i].getMaToTien().contains(tens[1])
                    || toTiens[i].getMaToTien().contains(tens[2]) || toTiens[i].getMaToTien().contains(tens[3]) 
                    || toTiens[i].getMaToTien().contains(tens[4]) || toTiens[i].getMaToTien().contains(tens[5]) ) {
                System.out.println(toTiens[i]);
            }
        }
        System.out.println("--------------------Phần 2--------------------");
        for (int i = 0; i < 10; i++) {
            if (toTiens[i].KiemTraChiaHet()) {
                System.out.println(toTiens[i]);
            }
        }
    }
}
