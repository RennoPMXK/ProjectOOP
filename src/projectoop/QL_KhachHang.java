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
public class QL_KhachHang {

    public static ArrayList<KhachHang> khachhang_list = new ArrayList<>();

    public QL_KhachHang() {
    }

    public static ArrayList<KhachHang> getKhachhang_list() {
        return khachhang_list;
    }

    public static void setKhachhang_list(ArrayList<KhachHang> khachhang_list) {
        QL_KhachHang.khachhang_list = khachhang_list;
    }

    public static void them(KhachHang kh) {
        khachhang_list.add(kh);
    }

    public static void xoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("|   Chọn khách hàng cần xóa: ");
        int index = Integer.parseInt(input.nextLine());
        System.out.println("|   Khách hàng " + index + " được chọn");
        khachhang_list.remove(--index);
        //input.close();
    }

    public static void danhsachkhachhang() {
        System.out.println("------------------------ Danh sách khách hàng -----------------------");
        System.out.println("STT\tMã khách hàng\tTên\tSố điện thoại\n--------------------------------------------");
        int index = 0;
        for (KhachHang i : khachhang_list) {
            System.out.println(++index + ". \t" + i.getMakhachhang() + "\t\t" + i.getTen() + "\t" + i.getSodienthoai());
        }
        System.out.println("--------------------------------------------");
    }

    public static void readFile() {
        try {
            Scanner scanFile = new Scanner(Paths.get("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\khachhang.txt"), Charset.forName("UTF-8"));
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (!row.equals("")) {
                    String[] data = row.split(";;");
                    khachhang_list.add(new KhachHang(data[0], data[1], data[2]));
                }
            }
        } catch (IOException e) {
        }
    }

    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\khachhang.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (KhachHang i : khachhang_list) {
                pw.println(i.getMakhachhang() + ";;" + i.getTen() + ";;" + i.getSodienthoai());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static void OverwriteFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\khachhang.txt", false);
            PrintWriter pw = new PrintWriter(fw);

            for (KhachHang i : khachhang_list) {
                pw.println(i.getMakhachhang() + ";;" + i.getTen() + ";;" + i.getSodienthoai());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

}
