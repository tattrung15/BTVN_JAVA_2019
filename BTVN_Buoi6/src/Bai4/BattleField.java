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
public class BattleField {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Monster monster = new Monster();
        
        int choicePlayer;
        
        do {            
            System.out.println("------------------ Lựa chọn Player ------------------");
            System.out.println("1. Archers");
            System.out.println("2. Knight");
            
            System.out.print("Chọn 1 or 2: ");
            choicePlayer = scanner.nextInt();
            
        } while (choicePlayer < 1 || choicePlayer > 2);
        
        switch(choicePlayer){
            case 1:
                Archers archers = new Archers();
                int choice;
                do {
                    System.out.println("------------------ Lựa chọn ai đánh trước ------------------");
                    System.out.println("1. Archers");
                    System.out.println("2. Monster");
                    
                    System.out.print("Lựa chọn: ");
                    choice = scanner.nextInt();
                    
                } while (choice < 1 || choice > 2);
                
                if (choice == 1) {
                    do {
                        int choiceSkill;
                        // Lượt Archers
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Archers turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(archers);
                        do {
                            System.out.println("------------------ Archers' Skills ------------------");
                            archers.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                archers.BanChay(monster);
                                break;
                            }
                            if (choiceSkill == 2 && archers.BanTen(monster)) {
                                break;
                            }
                        } while (true);
                        
                        if (monster.Chet()) {
                            System.out.println("Archers: Winner winner chicken dinner");
                            break;
                        }
                        // Lượt Monster
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Monster turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(monster);
                        do {
                            System.out.println("------------------ Monster's Skills ------------------");
                            monster.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                monster.ThoiLua(archers);
                                break;
                            }
                        } while (true);
                        
                        if (archers.Chet()) {
                            System.out.println("Monster: Winner winner chicken dinner");
                            break;
                        }
                        
                    } while (true);
                } else {
                    do {
                        int choiceSkill;
                        // Lượt Monster
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Monster turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(monster);
                        do {
                            System.out.println("------------------ Monster's Skills ------------------");
                            monster.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                monster.ThoiLua(archers);
                                break;
                            }
                        } while (true);
                        
                        if (archers.Chet()) {
                            System.out.println("Monster: Winner winner chicken dinner");
                            break;
                        }
                        // Lượt Archers
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Archers turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(archers);
                        do {
                            System.out.println("------------------ Archers' Skills ------------------");
                            archers.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                archers.BanChay(monster);
                                break;
                            }
                            if (choiceSkill == 2 && archers.BanTen(monster)) {
                                break;
                            }
                        } while (true);
                        
                        if (monster.Chet()) {
                            System.out.println("Archers: Winner winner chicken dinner");
                            break;
                        }
                    } while (true);
                }
                break;
            case 2:
                Knight knight = new Knight();
                int choice1;
                do {
                    System.out.println("------------------Lựa chọn ai đánh trước------------------");
                    System.out.println("1. Knight");
                    System.out.println("2. Monster");
                    
                    System.out.print("Lựa chọn: ");
                    choice1 = scanner.nextInt();
                    
                } while (choice1 < 1 || choice1 > 2);
                
                if (choice1 == 1) {
                    do {
                        int choiceSkill;
                        // Lượt Archers
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Knight turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(knight);
                        do {
                            System.out.println("------------------ Knight' Skills ------------------");
                            knight.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                knight.ChemChay(monster);
                                break;
                            }
                            if (choiceSkill == 2 && knight.LaChan(monster)) {
                                break;
                            }
                        } while (true);
                        
                        if (monster.Chet()) {
                            System.out.println("Knight: Winner winner chicken dinner");
                            break;
                        }
                        // Lượt Monster
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Monster turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(monster);
                        do {
                            System.out.println("------------------ Monster's Skills ------------------");
                            monster.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                monster.ThoiLua(knight);
                                break;
                            }
                        } while (true);
                        
                        if (knight.Chet()) {
                            System.out.println("Monster: Winner winner chicken dinner");
                            break;
                        }
                    } while (true);
                } else {
                    do {
                        int choiceSkill;
                        // Lượt Monster
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Monster turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(monster);
                        do {
                            System.out.println("------------------ Monster's Skills ------------------");
                            monster.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                monster.ThoiLua(knight);
                                break;
                            }
                        } while (true);
                        
                        if (knight.Chet()) {
                            System.out.println("Monster: Winner winner chicken dinner");
                            break;
                        }
                        // Lượt Knight
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>> Knight turn <<<<<<<<<<<<<<<<<<<<<<<<<<<");
                        System.out.println(knight);
                        do {
                            System.out.println("------------------ Knight's Skills ------------------");
                            knight.Skills();
                            System.out.print("Lựa chọn skill: ");
                            choiceSkill = scanner.nextInt();
                        
                            if (choiceSkill == 1) {
                                knight.ChemChay(monster);
                                break;
                            }
                            if (choiceSkill == 2 && knight.LaChan(monster)) {
                                break;
                            }
                        } while (true);
                        
                        if (monster.Chet()) {
                            System.out.println("Knight: Winner winner chicken dinner");
                            break;
                        }
                    } while (true);
                }
                break;
        }
    }
}
