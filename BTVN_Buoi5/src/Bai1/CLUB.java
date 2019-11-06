/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class CLUB {
    private String tenCLB = "HIT";
    private int soLuongTV;
    private Member[] members;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng thành viên: ");
        soLuongTV = scanner.nextInt();
        members = new Member[soLuongTV];
        for (int i = 0; i < soLuongTV; i++) {
            members[i] = new Member();
            members[i].nhap();
        }
    }
    
    public void xuat(){
        System.out.println("Tên CLB: " + tenCLB);
        System.out.println("Số lượng thành viên: " + soLuongTV);
        for(int i = 0; i < soLuongTV; i++){
            System.out.println(members[i]);
        }
    }
    
}
