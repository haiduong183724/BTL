/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chungkhoan;

import start.Input;
import java.util.List;

/**
 *
 * @author Hai Duong
 */
public class CoPhieu {

    CoPhieu() {
        if (i < in.list_input.size()) {
            List<String> arr = in.list_input.get(i);
            if (arr.size() == 6) {
                tenCP = arr.get(0);
                giaThayDoi = arr.get(1);
                giaHienTai = arr.get(2);
                tongBan = arr.get(3);
                giaTri = arr.get(4);
                noiGD = arr.get(5);
                i++;
                this.setRate();
            }
        }
        else {
            cau = "input is empty !";
        }
    }

    private static Input in = new Input("input.csv");
    static int i = 0;
    protected String tenCP;
    
    protected String giaThayDoi;

    protected String giaHienTai;

    protected Double rate ;// giaThayDoi/giaHienTai(%)

    protected String tongBan;// tổng lượng CP đã bán(triệu đơn vị)

    protected String giaTri; // = tongBan*giaHienTai(tỉ đồng)
    
    protected String noiGD;
    
    protected String cau;

    public String getGiaThayDoi() {
        return giaThayDoi;
    }

    public String getTongBan() {
        return tongBan + " triệu đơn vị ";
    }

    public String getGiaTri() {
        return giaTri + " tỉ đồng ";
    }

    public String getNoiGD() {
        return "tại " + noiGD + " ";
    }

    public String getTenCP() {
        return tenCP + " ";
    }
    private void setRate(){
        rate = (Double.parseDouble(giaThayDoi)/Double.parseDouble(giaHienTai))*100;
        rate = (double)Math.round(rate *100)/100;
    }
    
    public String getRate(){
        return rate.toString()+"% ";
    }
    
    public String getCau() {
        return cau + ".";
    }
    public String getGiaHienTai(){
    
        return this.giaHienTai + " điểm ";
    } 
}
