/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.util.ArrayList;

/**
 *
 * @author TRI
 */
public class ChiTietHD {

    private String makhachhang;
    private String mahoadon;
    private ArrayList<TheBook> cthd = new ArrayList<>();

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public ArrayList<TheBook> getCthd() {
        return cthd;
    }

    public void setCthd(ArrayList<TheBook> cthd) {
        this.cthd = cthd;
    }

}
