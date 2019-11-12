/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Tat Trung
 */
public class CauLacBo {
    private Leader a;
    private Support b;
    private Member c;

    public CauLacBo() {
    }

    public CauLacBo(Leader a, Support b, Member c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void ShowInfo(){
        a.ShowInfo();
        b.ShowInfo();
        c.ShowInfo();
    }
}
