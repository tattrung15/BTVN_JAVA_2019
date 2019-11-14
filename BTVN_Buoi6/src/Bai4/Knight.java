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
public class Knight {
    private int mau = 150;
    private int MP = 100;
    private int giap = 20;
    
    public void ChemChay(Monster monster){
        if (monster.getGiap() <= 40) {
            monster.setMau(monster.getMau() - (40 - monster.getGiap()));
        }
    }
    
    public boolean LaChan(Monster monster){
        if (this.MP < 50) {
            System.out.println("Knight không đủ MP");
            return false;
        } else {
            this.MP -= 50;
            if (monster.getGiap() <= 100) {
                monster.setMau(monster.getMau() - (100 - monster.getGiap()));
            }
            if (monster.getGiap() >= 30) {
                monster.setGiap(monster.getGiap() - 30);
            } else {
                monster.setGiap(0);
            }
            return true;
        }
    }
    
    public boolean Chet(){
        return this.mau <= 0;
    }
    
    public void Skills(){
        System.out.println("1. ChemChay{" + "dame=" + 40 + ", mana=" + 0 + ", arp=" + 0 + '}');
        System.out.println("2. LaChan{" + "dame=" + 100 + ", mana=" + 50 + ", arp=" + 30 + '}');
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getGiap() {
        return giap;
    }

    public void setGiap(int giap) {
        this.giap = giap;
    }

    @Override
    public String toString() {
        return "Knight{" + "mau=" + mau + ", MP=" + MP + ", giap=" + giap + '}';
    }
}
