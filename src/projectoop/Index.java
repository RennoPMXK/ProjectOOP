/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectoop;

import java.util.Scanner;

/**
 *
 * @author TRI
 */
public class Index {

    public static int soKhachhang = 0;//QL_KhachHang.getKhachhang_list().size();

    public static void onLoad() {
        QL_KhachHang.readFile();
        QL_GioHang.readFile();
        soKhachhang = QL_KhachHang.getKhachhang_list().size();
    }

    public static int dangnhap(String check) {
        for (int i = 0; i < QL_KhachHang.getKhachhang_list().size(); i++) {
            if (check.equals(QL_KhachHang.getKhachhang_list().get(i).getMakhachhang())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        onLoad();
        int choice;
        do {
            System.out.println("---------------- Chào mừng đến với cửa hàng sách! --------------");
            System.out.println("|   Danh mục chức năng: ");
            System.out.println("|   1. Đăng ký trở thành thành viên của cửa hàng.");
            System.out.println("|   2. Đăng nhập bằng mã khách hàng.");
            System.out.println("|   3. Xem qua cửa hàng (nhưng không thể mua hàng).");
            System.out.println("|   4. Trang dành cho nhân viên.");
            System.out.println("|   0. Thoát.");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Vui lòng nhập lựa chọn: ");

            Scanner input = new Scanner(System.in);
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    KhachHang kh = new KhachHang(++soKhachhang);
                    kh.dangki();
                    QL_KhachHang.them(kh);
                    //kh1.writeFile();
                    kh.khachMenu();
                }
                case 2 -> {
                    System.out.println("Đăng nhập bằng mã khách hàng đã cung cấp: ");
                    String check = input.nextLine();
                    int var = dangnhap(check);
                    if (var != -1) {
                        KhachHang kh = QL_KhachHang.khachhang_list.get(var);
                        System.out.println(kh.getMakhachhang());
                        kh.khachMenu();
                    } else {
                        System.out.println("Không tồn tại khách hàng!\nĐăng ký tài khoản mới: ");
                        KhachHang kh = new KhachHang(++soKhachhang);
                        kh.dangki();
                        QL_KhachHang.them(kh);
                        kh.khachMenu();
                    }
                }
                default ->
                    System.out.println("Chức năng tạm thời chưa sẵn sàng!");
            }
            //input.close();

            //QL_KhachHang.danhsachkhachhang();
        } while (choice != 0);
    }

}
