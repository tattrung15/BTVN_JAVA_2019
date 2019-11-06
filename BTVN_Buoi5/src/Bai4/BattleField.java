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
public class BattleField {
    public static void main(String[] args) {
        Human[] humans = new Human[2];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
            System.out.println("Nhập thông tin người thứ " + (i + 1));
            humans[i].nhap();
        }
        System.out.println("----------------------------Start----------------------------");
        Human humanWin = new Human();
        int i = 1;
        while (true) {
            System.out.println("Lượt đánh thứ " + (i++));
            humans[0].Attack(humans[1]);
            humans[1].Attack(humans[0]);
            System.out.println(humans[0]);
            System.out.println(humans[1]);
            if (humans[0].getHP() <= 0) {
                humanWin = humans[1];
                break;
            }
            if (humans[1].getHP() <= 0) {
                humanWin = humans[0];
                break;
            }
        }
        System.out.println("Người chiến thắng: ");
        System.out.println(humanWin);
    }
}
