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
public class Knight {
    private String name;
    private int HP;
    private int MP;
    
    public void Heal(){
        if (this.getMP() >= 50) {
            this.setHP(this.getHP() + 30);
            this.setMP(this.getMP() - 50);
        } else {
            System.out.println("Không đủ năng lượng");
        }
    }
    
    public void thongso(){
        System.out.println("HP = " + HP);
        System.out.println("MP = " + MP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
    
    
}
