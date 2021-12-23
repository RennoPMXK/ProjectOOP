/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRI
 */
public class GioHang {
    
    private String makhachhang;
    private ArrayList<Kh_Sach> giohang = new ArrayList<>();
    
    public GioHang() {
    }
    
    public ArrayList<Kh_Sach> getGiohang() {
        return giohang;
    }
    
    public void setGiohang(ArrayList<Kh_Sach> giohang) {
        this.giohang = giohang;
    }
    
    public String getMakhachhang() {
        return makhachhang;
    }
    
    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }
    
    public void them(Kh_Sach book) {
        this.giohang.add(book);
    }
    
    public void xoa(int index) {
        --index;
        this.giohang.remove(index);
    }
    
    public void xoaAll() {
        System.out.print("Bạn có muốn xóa toàn bộ sản phẩm trong giỏ hàng? [Y/N]: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        
        if (choice.contains("Y") && choice.contains("y")) {
            giohang.removeAll(giohang);
        }
    }
    
    public void thaydoiTrangthai(int index) {
        --index;
        if (this.giohang.get(index).isTrangthai()) {
            this.giohang.get(index).setTrangthai(false);
        } else {
            this.giohang.get(index).setTrangthai(true);
        }
    }
    
    public void thaydoiSL(int index, int soluong) {
        this.giohang.get(index).setSoluong(soluong);
    }
    
    public void napGiohang() {
        for (Kh_Sach i : QL_GioHang.getGiohang_list()) {
            if (i.getMakhachhang().equals(this.getMakhachhang())) {
                this.giohang.add(i);
            }
        }
    }
    
    @Override
    public String toString() {
        String s = "----------------------------------------------------------------------\n";
        int index = 0;
        for (Kh_Sach i : giohang) {
            s += "|   " + ++index + ". " + i.toString() + "\n";
        }
        s += "----------------------------------------------------------------------\n";
        return s;
    }
}
