/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Tat Trung
 */
public class JavaClass {
    private Student[] stdList;
    private int ratingStar;
    private String leader;
    
    private void InputStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = scanner.nextInt();
        stdList = new Student[n];
        for(int i = 0; i < n; i++){
            stdList[i] = new Student();
            stdList[i].InputInfo();
        }
    }
            
    private void ShowStudent(){
        for(int i = 0; i < stdList.length; i++){
            stdList[i].ShowInfo();
        }
    }
            
    public void InputClassInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên leader: ");
        leader = scanner.nextLine();
        System.out.print("Đánh giá chất lượng: ");
        ratingStar = scanner.nextInt();
        InputStudent();
    }
            
    public void ShowClassInfo(){
        System.out.println("Leader: " + leader);
        System.out.println("Rating Star: " + ratingStar);
        ShowStudent();
    }
}
