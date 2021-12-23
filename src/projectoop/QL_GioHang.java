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
public class QL_GioHang {

    public static ArrayList<Kh_Sach> giohang_list = new ArrayList<>();

    public QL_GioHang() {
    }

    public static ArrayList<Kh_Sach> getGiohang_list() {
        return giohang_list;
    }

    public static void setGiohang_list(ArrayList<Kh_Sach> giohang_list) {
        QL_GioHang.giohang_list = giohang_list;
    }

    public static void readFile() {
        try {
            Scanner scanFile = new Scanner(Paths.get("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\giohang.txt"), Charset.forName("UTF-8"));
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (!row.equals("")) {
                    String[] data = row.split(";;");
                    giohang_list.add(new Kh_Sach(data[0], data[1], Boolean.getBoolean(data[2])));
                }
            }
        } catch (IOException e) {
        }
    }

    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\giohang.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (Kh_Sach i : giohang_list) {
                pw.println(i.getMakhachhang() + ";;" + i.getId_sach() + ";;" + i.getSoluong() + ";;" + i.isTrangthai());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

}
