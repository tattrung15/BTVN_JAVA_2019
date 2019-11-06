/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class Human {
    private String name;
    private int HP;
    private int dmg;
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập HP: ");
        HP = scanner.nextInt();
        System.out.print("Nhập dmg: ");
        dmg = scanner.nextInt();
    }
    
    public void Attack(Human human){
        this.HP = this.HP - human.getDmg();
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

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", HP=" + HP + ", dmg=" + dmg + '}';
    }
    
    
}
