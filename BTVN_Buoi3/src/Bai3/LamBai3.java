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
public class LamBai3 {
    
    public static void HienThiMang(int []a){
        for(int b: a){
            System.out.print(b + " ");
        }
    }
    
    public static int[] ThemPhanTu(int []a, Scanner scanner){
        int tempIndex = a.length + 1;
        int[] tempMang = new int[tempIndex];
        System.out.print("Nhập phần tử cần thêm: ");
        int pt = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int vt = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < tempIndex; i++) {
            if(i == vt){
                tempMang[i] = pt;
            } else {
                tempMang[i] = a[k++];
            }
        }
        return tempMang;
    }
    
    public static int[] XoaPhanTu(int []a, Scanner scanner){
        int tempIndex = a.length - 1;
        int[] tempMang = new int[tempIndex];
        System.out.print("Nhập vị trí cần xóa: ");
        int vt = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != vt) {
                tempMang[k++] = a[i];
            }
        }
        return tempMang;
    }
    
    public static int[] DaoMang(int []a){
        int[] tempMang = new int[a.length];
        int k = 0;
        for (int i = a.length - 1; i >= 0 ; i--) {
            tempMang[k++] = a[i];
        }
        return tempMang;
    }
    
    public static void HienThiSoChiaHet(int []a){
        int temp = a[1], dem = 0;
        boolean check = false;
        
        for(int i = 0; i < a.length; i++){
            if (a[i] != temp && a[i] % temp == 0) {
                dem++;
            }
        }
        if(dem != 0){
            int[] tempMang = new int[dem];
            dem = 0;
            for(int i = 0; i < a.length; i++){
                if (a[i] != temp && a[i] % temp == 0) {
                    tempMang[dem++] = a[i];
                }
            }
            System.out.print("a[1] = " + temp + ". Số chia hết cho a[1]: ");
            for(int i = 0; i < a.length; i++){
                if (a[i] != temp && a[i] % temp == 0) {
                    System.out.print(a[i] + " ");
                }
            }
        } else {
            System.out.println("Không có số nào chia hết cho a[1]");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int choice;
        do {            
            
            System.out.println("\n----------------------MENU----------------------");
            System.out.println("1. Hiển thị mảng vừa tạo");
            System.out.println("2. Thêm một phần tử vào vị trí thứ k");
            System.out.println("3. Xóa một phần tử ở vị trí thứ k");
            System.out.println("4. Đảo ngược mảng");
            System.out.println("5. Hiển thị số a[1] và các số chia hết cho a[1]");
            System.out.println("6. Thoát.");
            
            System.out.print("Lựa chọn: ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    HienThiMang(a);
                    break;
                case 2:
                    a = ThemPhanTu(a, scanner);
                    break;
                case 3:
                    a = XoaPhanTu(a, scanner);
                    break;
                case 4:
                    a = DaoMang(a);
                    break;
                case 5:
                    HienThiSoChiaHet(a);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            
        } while (choice != 7);
    }
}
