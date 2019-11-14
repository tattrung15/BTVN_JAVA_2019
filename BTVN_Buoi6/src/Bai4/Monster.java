/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Tat Trung
 */
public class Monster {
    private int mau = 500;
    private int giap = 20;
    
    public void ThoiLua(Archers archers){
        if (archers.getGiap() <= 30) {
            archers.setMau(archers.getMau() - (30 - archers.getGiap()));
        }
    }
    
    public void ThoiLua(Knight knight){
        if (knight.getGiap() <= 30) {
            knight.setMau(knight.getMau() - (30 - knight.getGiap()));
        }
    }
    
    public boolean Chet(){
        return this.mau <= 0;
    }
    
    public void Skills(){
        System.out.println("1. ThoiLua{" + "dame=" + 30 + ", mana=" + 0 + ", arp=" + 0 + '}');
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getGiap() {
        return giap;
    }

    public void setGiap(int giap) {
        this.giap = giap;
    }

    @Override
    public String toString() {
        return "Monster{" + "mau=" + mau + ", giap=" + giap + '}';
    }
    
    
}
