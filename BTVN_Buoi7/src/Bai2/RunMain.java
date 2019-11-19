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
public class RunMain {
    public static void main(String[] args) {
        Oto oto = new Oto(40, 100, "giro 2019", 2019, "lamborghini");
        Moto moto = new Moto(150, "Hypermotard 950", 1926, "Ducati");
        System.out.println(oto);
        System.out.println(moto);
    }
}
