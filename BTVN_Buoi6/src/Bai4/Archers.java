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
public class Archers {
    private int mau = 200;
    private int MP = 150;
    private int giap = 10;
    
    public void BanChay(Monster monster){
        if (monster.getGiap() <= 30) {
            monster.setMau(monster.getMau() - (30 - monster.getGiap()));
        }
    }
    
    public boolean BanTen(Monster monster){
        if (this.MP < 30) {
            System.out.println("Archers không đủ MP");
            return false;
        } else {
            this.MP -= 30;
            if (monster.getGiap() <= 100) {
                monster.setMau(monster.getMau() - (100 - monster.getGiap()));
            }
            if (monster.getGiap() >= 10) {
                monster.setGiap(monster.getGiap() - 10);
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
        System.out.println("1. BanChay(hit){" + "dame=" + 30 + ", mana=" + 0 + ", arp=" + 0 + '}');
        System.out.println("2. BanTen(aim){" + "dame=" + 100 + ", mana=" + 30 + ", arp=" + 10 + '}');
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
        return "Archers{" + "mau=" + mau + ", MP=" + MP + ", giap=" + giap + '}';
    }
    
    
}
