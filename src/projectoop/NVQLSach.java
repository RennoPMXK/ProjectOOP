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
public class NVQLSach extends NhanVien {

    private int sogiolamviec;
    private int luong;

    public NVQLSach() {
    }

    public NVQLSach(int sogiolamviec, int luong) {
        this.sogiolamviec = sogiolamviec;
        this.luong = luong;
    }

    public NVQLSach(int sogiolamviec, int luong, String manhanvien, String trangthainhanvien, String Loainv) {
        super(manhanvien, trangthainhanvien, Loainv);
        this.sogiolamviec = sogiolamviec;
        this.luong = luong;
    }

    public NVQLSach(int sogiolamviec, int luong, String manhanvien, String trangthainhanvien, String Loainv, String ten, char gioitinh, DiaChi diachi) {
        super(manhanvien, trangthainhanvien, Loainv, ten, gioitinh, diachi);
        this.sogiolamviec = sogiolamviec;
        this.luong = luong;
    }

    public int getSogiolamviec() {
        return sogiolamviec;
    }

    public int getLuong() {
        return luong;
    }

    public void setSogiolamviec(int sogiolamviec) {
        this.sogiolamviec = sogiolamviec;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void tinhluong() {

        this.setLuong(getSogiolamviec() * 25000);

    }

    @Override
    public void setInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("So gio lam viec");
        this.setSogiolamviec(input.nextInt());
        System.out.println("Luong");
        this.setLuong(input.nextInt());

    }

    @Override
    public String toString() {
        return "nhanvienQLsach{" + "sogiolamviec=" + sogiolamviec + ", luong=" + luong + '}';
    }

}
