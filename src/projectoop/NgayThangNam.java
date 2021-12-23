/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoop;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

/**
 *
 * @author TRI
 */
public class NgayThangNam {

    public NgayThangNam() {
    }

    public static String get() {
        Date d = new Date();
        Locale lcl = Locale.FRENCH;
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT, lcl);
        String str = dFormat.format(d);
        return str;
    }
}
