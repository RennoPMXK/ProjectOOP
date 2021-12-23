/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author TRI
 */
public class Kh_Sach {

    private String id_sach;
    private String makhachhang;
    private int soluong;
    private boolean trangthai;

    public Kh_Sach() {
    }

    public Kh_Sach(String id_sach, String makhachhang) {
        this.id_sach = id_sach;
        this.makhachhang = makhachhang;
    }

    public Kh_Sach(String makhachhang, String id_sach, boolean trangthai) {
        this.id_sach = id_sach;
        this.makhachhang = makhachhang;
        this.trangthai = trangthai;
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        String temp;
        if (this.isTrangthai()) {
            temp = "Đã chọn";
        } else {
            temp = "Chưa chọn";
        }

        return this.getId_sach() + " Số lượng: " + this.getSoluong() + temp;
    }

}
