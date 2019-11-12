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
public class MayTinh {
    public float TinhTong(float a, float b){
        return (a + b);
    }
    
    public float TinhTong(float a, float b, float c){
        return (a + b + c);
    }
    
    public float TinhTong(float a[]){
        float s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
}
