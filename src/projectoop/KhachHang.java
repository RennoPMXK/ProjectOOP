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
public class KhachHang extends ConNguoi {

    private String makhachhang;
    //private static int soKhachhang = 0;

    private String sodienthoai;
    private DiaChi dcgiaohang;
    private DanhsachDiachi danhsachdchi = new DanhsachDiachi(makhachhang);
    private GioHang giohang = new GioHang();

    public KhachHang() {
    }

    public KhachHang(int soKhachhang) {
        this.makhachhang = "KH" + soKhachhang;
        this.giohang.setMakhachhang(makhachhang);
    }

    public KhachHang(String makhachhang) {
        this.makhachhang = makhachhang;
        this.giohang.setMakhachhang(makhachhang);
    }

    public KhachHang(String makhachhang, String ten, String sodienthoai) {
        this.makhachhang = makhachhang;
        super.setTen(ten);
        this.sodienthoai = sodienthoai;
    }

    public KhachHang(String sodienthoai, DiaChi dcgiaohang, int soKhachhang) {
        this.makhachhang = "KH" + soKhachhang;

        this.sodienthoai = sodienthoai;
        this.dcgiaohang = dcgiaohang;
        this.giohang.setMakhachhang(makhachhang);
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public DiaChi getDcgiaohang() {
        return dcgiaohang;
    }

    public void setDcgiaohang(DiaChi dcgiaohang) {
        this.dcgiaohang = dcgiaohang;
    }

    // Danh cho nhan vien
    @Override
    public void setInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập khách hàng mới: ");
        super.setInfo();

        System.out.print("Nhap so dien thoai: ");
        this.setSodienthoai(input.nextLine());

        System.out.println("Nhap dia chi giao hang: ");
        DiaChi dc = new DiaChi();
        dc.setInfo();
        this.setDcgiaohang(dc);
        //input.close();
    }

    public void dangki() {
        Scanner input = new Scanner(System.in);

        // System.out.println("Chao mung den voi cua hang!");
        System.out.println("Vui lòng nhập thông tin của bạn: ");
        super.setInfo();
        System.out.print("Số điện thoại: ");
        this.setSodienthoai(input.nextLine());

        this.setDcgiaohang(super.getDiachi());
        this.danhsachdchi.them(this.getDcgiaohang());
        this.danhsachdchi.setMakhachhang(this.getMakhachhang());

        System.out.println("Cảm ơn đã trở thành khách hàng của chúng tôi!");
        //input.close();
    }

    public void xemDC() {
        System.out.println("Sổ địa chỉ của bạn: ");
        System.out.println(this.danhsachdchi.toString());
    }

    public void xemGiohang() {
        this.giohang.napGiohang();
        System.out.println("Giỏ hàng của bạn: ");
        System.out.println(this.giohang.toString());
    }

    @Override
    public String toString() {
        return "|   Thông tin cá nhân:\n"
                + "|   Mã khách hàng: " + this.getMakhachhang()
                + "\n|   Tên: " + this.getTen()
                + "\n|   Số điện thoại: " + this.getSodienthoai() + "\n";
    }

    public void khachMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n-------------------- Trang cá nhân khách hàng ------------------");
            System.out.println("|   Danh mục chức năng: ");
            System.out.println("|   1. Xem thông tin cá nhân.");
            System.out.println("|   2. Xem sổ địa chỉ.");
            System.out.println("|   3. Xem giỏ hàng.");
            System.out.println("|   4. Xem các đơn hàng đã đặt.");
            System.out.println("|   0. Quay lại trang chủ.");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Vui lòng nhập lựa chọn: ");

            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    System.out.println(this.toString());
                }
                case 2 -> {
                    this.xemDC();
                    this.menuDiachi();
                }
                case 3 -> {
                    this.xemGiohang();
                    this.menuGiohang();
                }
                default ->
                    System.out.println("Not support yet. Coming soon!");
            }
        } while (choice != 0);
        //input.close();
    }

    public void menuDiachi() {
        this.danhsachdchi.readFile();

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----------------------- Các chức năng của sổ địa chỉ: -------------------");
            System.out.println("|   1. Xem sổ địa chỉ.");
            System.out.println("|   2. Thêm một địa chỉ.");
            System.out.println("|   3. Cập nhật một địa chỉ.");
            System.out.println("|   4. Xóa một địa chỉ.");
            System.out.println("|   5. Xóa toàn bộ địa chỉ. (Yêu cầu thêm một địa chỉ cuối cùng)");
            System.out.println("|   6. Nạp DC");
            System.out.println("|   0. Quay lại trang trước");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Vui lòng chọn chức năng: ");

            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0 -> {
                    // clearscreen();
                    //this.khachMenu();
                    break;
                }
                case 1 -> {
                    this.xemDC();
                }
                case 2 -> {
                    this.danhsachdchi.them();
                    this.danhsachdchi.writeFile();
                }
                case 3 -> {
                    this.xemDC();
                    this.danhsachdchi.sua();
                }
                case 4 -> {
                    this.xemDC();
                    this.danhsachdchi.xoa();
                }
                case 5 -> {
                    this.xemDC();
                    this.danhsachdchi.xoaAll();
                    System.out.println("Vui lòng thêm 1 địa chỉ: ");
                    this.danhsachdchi.them();
                }
                case 6 -> {
                    this.danhsachdchi.readFile();
                }
                default -> {
                    System.out.println("Chức năng này chưa hỗ trợ!");
                }
            }
        } while (choice != 0);
        //input.close();
    }

    public void menuGiohang() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("------------------------ Các chức năng của Giỏ hàng: --------------------");
            System.out.println("|   1. Xem chi tiết một sản phẩm.");
            System.out.println("|   2. Xóa 1 sản phẩm.");
            System.out.println("|   3. Chọn mua hay không mua.");
            System.out.println("|   4. Thay đổi số lượng sản phẩm.");
            System.out.println("|   5. Xóa toàn bộ giỏ hàng.");
            System.out.println("|   0. Quay lại trang trước.");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Vui lòng chọn chức năng: ");

            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 0 -> {
                    // clearscreen();
                    //this.khachMenu();
                    break;
                }
                case 1 -> {
                    System.out.println("Chưa hỗ trợ!");
                }
                case 2 -> {
                    System.out.println("Chọn sản phẩm: ");
                    int index = Integer.parseInt(input.nextLine());
                    this.giohang.xoa(index);
                    this.xemGiohang();
                }
                case 3 -> {
                    System.out.println("Chọn sản phẩm: ");
                    int index = Integer.parseInt(input.nextLine());

                    this.giohang.thaydoiTrangthai(index);
                }
                case 4 -> {
                    System.out.println("Chọn sản phẩm: ");
                    int index = Integer.parseInt(input.nextLine());
                    System.out.println("Số lượng: ");
                    int sl = Integer.parseInt(input.nextLine());

                    this.giohang.thaydoiSL(index, sl);
                    this.xemGiohang();
                }
                case 5 -> {
                    this.giohang.xoaAll();
                }
                default -> {
                    System.out.println("Chức năng này chưa hỗ trợ!");
                }
            }
        } while (choice != 0);
        //input.close();
    }
}
