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
public class NVGiaoHang extends NhanVien {

    private int solangiao;
    private int luong;

    public NVGiaoHang() {
    }

    public NVGiaoHang(int solangiao, int luong) {
        this.solangiao = solangiao;
        this.luong = luong;
    }

    public NVGiaoHang(int solangiao, int luong, String manhanvien, String trangthainhanvien, String Loainv) {
        super(manhanvien, trangthainhanvien, Loainv);
        this.solangiao = solangiao;
        this.luong = luong;
    }

    public NVGiaoHang(int solangiao, int luong, String manhanvien, String trangthainhanvien, String Loainv, String ten, char gioitinh, DiaChi diachi) {
        super(manhanvien, trangthainhanvien, Loainv, ten, gioitinh, diachi);
        this.solangiao = solangiao;
        this.luong = luong;
    }

    public int getSolangiao() {
        return solangiao;
    }

    public void setSolangiao(int solangiao) {
        this.solangiao = solangiao;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void tinhluong() {

    }

    @Override
    public void setInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("So lan giao hang");
        this.setSolangiao(input.nextInt());
        System.out.println("Luong");
        this.setLuong(input.nextInt());

    }

    @Override
    public String toString() {
        return "nhanviengiaohang{" + "solangiao=" + solangiao + ", luong=" + luong + '}';
    }

}
