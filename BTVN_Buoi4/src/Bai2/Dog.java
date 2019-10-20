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
public class Dog {
    private String name = "";
    private int MP = 100;

    public void InputName(String name){
        this.name = name;
    }
    
    public void ShowMP(){
        System.out.println("MP đang có: " + MP);
    }
    
    public void Bark(){
        if(!name.equals("")){
            System.out.println(name + " gâu gâu");
            MP = MP - 20;
        } else {
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
    }
    
}
