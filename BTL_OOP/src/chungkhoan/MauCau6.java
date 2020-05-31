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
public class MauCau6 extends CoPhieu{
    public MauCau6(){
        if(this.tenCP != null){
        cau = cw.get(0) + this.getNoiGD() + this.getTenCP() 
             + this.getGiaThayDoi() + cw.get(1) + this.getTongBan();
        }
    }
    public static ConnectWord cw = new ConnectWord("maucau6.txt");
    
    public String getGiaThayDoi(){
        return "giảm nhẹ " + this.giaThayDoi + " đơn vị ";
    }
    
    
}
