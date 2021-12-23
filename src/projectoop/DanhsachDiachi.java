/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TRI
 */
public class DanhsachDiachi implements IOFile {

    private String makhachhang;
    private ArrayList<DiaChi> danhsachDC = new ArrayList<>();

    public DanhsachDiachi() {
    }

    public DanhsachDiachi(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public ArrayList<DiaChi> getDanhsachDC() {
        return danhsachDC;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public void setDanhsachDC(ArrayList<DiaChi> danhsachDC) {
        this.danhsachDC = danhsachDC;
    }

    public void them() {
        DiaChi dc = new DiaChi();
        dc.setInfo();
        this.danhsachDC.add(dc);
    }

    public void them(DiaChi dc) {
        this.danhsachDC.add(dc);
    }

    public void sua() {
        Scanner input = new Scanner(System.in);

        System.out.print("Chọn địa chỉ cần cập nhật thông tin: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("Địa chỉ " + index + " được chọn");
        this.danhsachDC.get(--index).setInfo();
        //input.close();
    }

    public void xoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Chọn địa chỉ cần xóa: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("Địa chỉ " + index + " được chọn");
        this.danhsachDC.remove(--index);
        //input.close();
    }

    public void xoaAll() {
        System.out.print("Bạn có muốn xóa toàn bộ địa chỉ? [Y/N]: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if (choice.contains("Y") && choice.contains("y")) {
            danhsachDC.removeAll(danhsachDC);
        }
        //input.close();
    }

    @Override
    public String toString() {
        String s = "----------------------------------------------------------------------\n";
        int index = 0;
        for (DiaChi i : this.danhsachDC) {
            s += "|   " + ++index + ". " + i.toString() + "\n";
        }
        s += "----------------------------------------------------------------------\n";
        return s;
    }

    @Override
    public void readFile() {
        try {
            Scanner scanFile = new Scanner(Paths.get("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\sodiachi.txt"), Charset.forName("UTF-8"));
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (!row.equals("")) {
                    String[] data = row.split(";;");
                    if (data[0].equals(this.getMakhachhang())) {
                        this.danhsachDC.add(new DiaChi(data[2], data[3], data[4], data[5], data[6]));
                    }
                }
            }
        } catch (IOException e) {
        }
    }

    @Override
    public void writeFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\sodiachi.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            int index = 0;
            for (DiaChi i : this.danhsachDC) {
                pw.println(this.getMakhachhang() + ";;" + ++index + ";;" + i.getSonha() + ";;" + i.getDuong() + ";;" + i.getPhuong() + ";;" + i.getQuan() + ";;" + i.getTinhthanh());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }
}
