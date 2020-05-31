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
public class MauCau4 extends CoPhieu{
    public MauCau4(){
        if(this.tenCP != null){
            
               cau = cw.get(0) + this.getTenCP() + cw.get(1) + this.getGiaHienTai() 
                + this.getGiaThayDoi() + cw.get(2) + this.getTongBan() +
                cw.get(3) + this.getGiaTri();
        }
        
    }
    
    
    
    public static ConnectWord cw = new ConnectWord("maucau4.txt");
   
    @Override
    public String getGiaThayDoi(){
        return "giảm "+ this.giaThayDoi+ " điểm, ";
    }
    @Override
    public String getGiaHienTai(){
    
        return this.giaHienTai + " điểm, ";
    }
}
