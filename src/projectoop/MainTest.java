/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author TRI
 */
public class MainTest {

    public static void main(String[] args) {

        Mang_TheLoai.theloai_list.add(new Category("01", "Van hoa"));
        Mang_TheLoai.theloai_list.add(new Category("02", "Kinh te"));
        Mang_TheLoai.theloai_list.add(new Category("03", "Thieu nhi"));
        Mang_TheLoai.theloai_list.add(new Category("04", "Lich su"));
        Mang_TheLoai.theloai_list.add(new Category("05", "Giao khoa"));
        Mang_TheLoai.theloai_list.add(new Category("06", "Ngoai ngu"));
        Mang_TheLoai.theloai_list.add(new Category("07", "Tam ly"));
//
//        //Mang_TheLoai.OverwriteFile();
//        //Mang_TheLoai.getTheloai_list().get(0).getCategoryName();
        Author au1 = new Author();
        Author au2 = new Author();
        au1.setAuthorName("Tri");
        au2.setAuthorName("Minh");
        Author[] author = {au1, au2};
//
        QL_Sach.listofBook.add(new PageBook("S01", "Java Turtorials", Mang_TheLoai.getTheloai_list().get(0), author.length, author, "Trẻ", "Không có mô tả", 302000, 302, 11, 11, 3, true, 10));
        QL_Sach.listofBook.add(new PageBook("S02", "Python Turtorials", Mang_TheLoai.getTheloai_list().get(2), author.length, author, "Trẻ", "Không có mô tả", 302000, 302, 11, 11, 3, true, 10));
        QL_Sach.listofBook.add(new PageBook("S03", "C++ Turtorials", Mang_TheLoai.getTheloai_list().get(4), author.length, author, "Trẻ", "Không có mô tả", 302000, 302, 11, 11, 3, true, 10));
//        
        QL_Sach.writeFile();
        QL_Sach.writeEBookFile();
        QL_Sach.writePageBookFile();
//        QL_Sach.readFile();
        QL_Sach.danhsachSach();
        QL_Sach.timSach();
//        QL_Sach qls = new QL_Sach();
//        qls.searchBook();

//        QL_NhanVien.NV_list.add(new NVGiaoHang(4, 500000, "NV01", "Part-time", "NVGiaohang"));
//        QL_NhanVien.NV_list.add(new NVGiaoHang(4, 500000, "NV02", "Full-time", "NVGiaohang"));
//        QL_NhanVien.NV_list.add(new NVQLSach(24, 500000, "NV03", "Part-time", "NVQLSach"));
//        
        // chạy writeFile thì không chạy readFile và ngược lại
//        QL_NhanVien.writeFile();
//        QL_NhanVien.readFile();
//        QL_NhanVien.danhsachNhanvien();
    }
}
