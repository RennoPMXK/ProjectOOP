/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.util.Scanner;

/**
 *
 * @author TRI
 */
public class DiaChi {

    private String sonha;
    private String duong;
    private String phuong;
    private String quan;
    private String tinhthanh;

    Scanner input = new Scanner(System.in);

    public DiaChi() {
    }

    public DiaChi(String sonha, String duong, String phuong, String quan, String tinhthanh) {
        this.sonha = sonha;
        this.duong = duong;
        this.phuong = phuong;
        this.quan = quan;
        this.tinhthanh = tinhthanh;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }

    public void setInfo() {
        System.out.print("Số nhà: ");
        this.setSonha(input.nextLine());
        System.out.print("Đường: ");
        this.setDuong(input.nextLine());
        System.out.print("Phường: ");
        this.setPhuong(input.nextLine());
        System.out.print("Quậnn: ");
        this.setQuan(input.nextLine());
        System.out.print("Tỉnh/Thành phố: ");
        this.setTinhthanh(input.nextLine());
    }

    @Override
    public String toString() {
        return this.getSonha() + " " + this.getDuong() + ", Phường " + this.getPhuong() + ", Quận " + this.getQuan() + ", Tỉnh/Thành phố " + this.getTinhthanh();
    }
}
