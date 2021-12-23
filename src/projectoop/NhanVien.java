/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NhanVien extends ConNguoi {

    private String manhanvien;
    private String trangthainhanvien;
    private String Loainv;

    public NhanVien() {
    }

    public NhanVien(String manhanvien, String trangthainhanvien, String Loainv) {
        this.manhanvien = manhanvien;
        this.trangthainhanvien = trangthainhanvien;
        this.Loainv = Loainv;
    }

    public NhanVien(String manhanvien, String trangthainhanvien, String Loainv, String ten, char gioitinh, DiaChi diachi) {
        super(ten, gioitinh, diachi);
        this.manhanvien = manhanvien;
        this.trangthainhanvien = trangthainhanvien;
        this.Loainv = Loainv;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTrangthainhanvien() {
        return trangthainhanvien;
    }

    public void setTrangthainhanvien(String trangthainhanvien) {
        this.trangthainhanvien = trangthainhanvien;
    }

    public String getLoainv() {
        return Loainv;
    }

    public void setLoainv(String Loainv) {
        this.Loainv = Loainv;
    }

    public void setInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("MaNV");
        this.setManhanvien(input.nextLine());
        System.out.println("Trang thai NV");
        this.setTrangthainhanvien(input.nextLine());
        System.out.println("Loai NV");
        this.setLoainv(input.nextLine());

    }

}
