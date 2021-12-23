/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

/**
 *
 * @author TRI
 */
public class TacGia extends ConNguoi {

    private String email;
    private int namsinh;
    private int nammat;

    public TacGia() {
        this.email = "Unnamed@abc.com";
    }

    public boolean checkMail(String mail) {
        if (mail.contains("@") && mail.contains(".")) {
            return true;
        }
        return false;
    }

    public TacGia(String email, int namsinh, int nammat) {
        if (checkMail(email)) {
            this.email = email;
        }
        this.namsinh = namsinh;
        this.nammat = nammat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getNammat() {
        return nammat;
    }

    public void setNammat(int nammat) {
        this.nammat = nammat;
    }

}
