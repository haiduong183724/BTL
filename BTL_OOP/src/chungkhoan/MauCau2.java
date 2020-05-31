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
public class MauCau2 extends CoPhieu {
    public MauCau2(){
        if(this.tenCP != null){
            
            cau = cw.get(0)+this.getTenCP() + cw.get(1) +  this.getTongBan()
                + cw.get(2)+this.getGiaTri() ;
        }
    }   
    public static ConnectWord cw = new ConnectWord("maucau2.txt");
   

        
}
