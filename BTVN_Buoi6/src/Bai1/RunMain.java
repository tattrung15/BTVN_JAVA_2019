/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Tat Trung
 */
public class RunMain {
    public static void main(String[] args) {
        ConHeo conHeo1 = new  ConHeo("A", 102.4, 2);
        ConHeo conHeo2 = new  ConHeo("B", 100.3, 1);
        ConHeo conHeo3 = new  ConHeo("C", 130.4, 2);
        ConHeo conHeo4 = new  ConHeo("D", 100.7, 4);
        ConHeo conHeo5 = new  ConHeo("E", 92.2, 1);
        conHeo1.ShowInfo();
        conHeo2.ShowInfo();
        conHeo3.ShowInfo();
        conHeo4.ShowInfo();
        conHeo5.ShowInfo();
    }
}
