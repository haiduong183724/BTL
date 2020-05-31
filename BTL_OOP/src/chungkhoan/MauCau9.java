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
public class MauCau9 extends CoPhieu{
    public MauCau9(){
        if(this.tenCP != null){
        cau = this.getTenCP() + cw.get(0) + this.getGiaThayDoi() + 
                cw.get(1);
        }
    }
    public static ConnectWord cw = new ConnectWord("maucau9.txt");
    @Override
    public String getGiaThayDoi(){
        return "giảm " + this.giaThayDoi + " điểm "; 
    }
}
