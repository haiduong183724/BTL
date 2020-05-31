/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chungkhoan;

import start.ConnectWord;

/**
 *
 * @author Hai Duong
 */
public class MauCau7 extends CoPhieu{
    public MauCau7(){
        if(this.tenCP != null){
      
            cau = this.getTenCP() + cw.get(0);
        }
    }
    public static ConnectWord cw = new ConnectWord("maucau7.txt");
   
}
