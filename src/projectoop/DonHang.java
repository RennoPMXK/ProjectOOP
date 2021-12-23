/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author TRI
 */
public class DonHang {

    private String makhachhang;
    private String madonhang;
    private String ngaytaodon;
    private double thanhtien;
    private int trangthai;

    public DonHang() {
    }

    public String getNgaytaodon() {
        return ngaytaodon;
    }

    public void setNgaytaodon(String ngaytaodon) {
        this.ngaytaodon = ngaytaodon;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    public DonHang(String makhachhang, String madonhang) {
        this.makhachhang = makhachhang;
        this.madonhang = madonhang;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getMadonhang() {
        return madonhang;
    }

    public void setMadonhang(String madonhang) {
        this.madonhang = madonhang;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String convertTrangthai(int check) {
        return switch (check) {
            case 1 ->
                "Đang giao hàng";
            case 2 ->
                "Đã hoàn thành";
            default ->
                "Chưa xử lý";
        };
    }

    @Override
    public String toString() {
        return "Mã đơn hàng: " + this.getMadonhang()
                + " Mã khách hàng: " + this.getMakhachhang()
                + " Ngày mua: " + this.getNgaytaodon()
                + " Thành tiền: " + this.getThanhtien()
                + " Trạng thái: " + this.convertTrangthai(this.getTrangthai());
    }

}
