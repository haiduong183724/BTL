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
public class MauCau8 extends CoPhieu {
    public MauCau8(){
        if(this.tenCP != null){
        cau = this.getNoiGD() + this.getTenCP() + cw.get(0) + this.getGiaHienTai()
                + this.getRate() + cw.get(1);
        }
    }
    public static ConnectWord cw = new ConnectWord("maucau8.txt");
    
    
    @Override
    public String getGiaThayDoi(){
        return "giảm tới " + this.giaThayDoi +" điểm ";
    }
    public String getRate(){
        return "tương đương " + super.getRate();
    
    }
}
