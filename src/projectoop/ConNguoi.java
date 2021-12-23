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
public class ConNguoi {

    private String ten;
    private char gioitinh;
    private DiaChi diachi;

    public ConNguoi() {
        this.ten = "Unnamed";
        this.gioitinh = 'U';
    }

    public ConNguoi(String ten, char gioitinh, DiaChi diachi) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public char getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(char gioitinh) {
        this.gioitinh = gioitinh;
    }

    public DiaChi getDiachi() {
        return diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public void setInfo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Tên: ");
        this.setTen(input.nextLine());
        System.out.print("Giới tính (F/M): ");
        String gender = input.nextLine();
        if (gender.equals("F") || gender.equals("f")) {
            this.setGioitinh('F');
        } else {
            this.setGioitinh('M');
        }
        System.out.println("Vui lòng nhập Địa chỉ của bạn:");
        DiaChi dc = new DiaChi();
        dc.setInfo();
        this.setDiachi(dc);
        //input.close();
    }
}
