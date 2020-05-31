/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chungkhoan;
import start.*;
/**
 *
 * @author Hai Duong
 */
// Cổ phiếu tăng giá
public class MauCau1 extends CoPhieu {
    
    public MauCau1(){
            if(this.tenCP != null){
            cau = cw.get(0) + this.getTenCP() + cw.get(1)+ this.getGiaTri() + 
                    cw.get(2);
        }
    }
    
    public static ConnectWord cw = new ConnectWord("maucau1.txt");
    
    
}

