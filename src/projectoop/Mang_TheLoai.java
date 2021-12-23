/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.util.ArrayList;

/**
 *
 * @author TRI
 */
public class Mang_TheLoai implements IOFile {

    private ArrayList<Category> theloai_list = new ArrayList<>();

    public Mang_TheLoai() {
    }

    public ArrayList<Category> getTheloai_list() {
        return theloai_list;
    }

    public void setTheloai_list(ArrayList<Category> theloai_list) {
        this.theloai_list = theloai_list;
    }

    @Override
    public void readFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void writeFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
