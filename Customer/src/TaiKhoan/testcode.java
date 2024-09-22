
package TaiKhoan;

import java.util.*;
import MayBay.ThongTinGhe;
import MayBay.ThongTinMayBay;
import ThongTinVe.Ve;

public class testcode {
    public static void main(String[] args) {
        // Tạo đối tượng ThongTinNguoiDung
        ThongTinNguoiDung n = new ThongTinNguoiDung("DCMinh", "12/34/56", "Ha Noi", "Hmong", "01231241251215");
        
        // Tạo đối tượng ThongTinTaiKhoan và truyền đối tượng nguoiDung
        ThongTinTaiKhoan t = new ThongTinTaiKhoan("helloae", "123345", n);
        //System.out.println(t);
        ThongTinGhe g = new ThongTinGhe("A1", true);
        
        ThongTinMayBay b = new ThongTinMayBay("3h", "Tu22M3", "JetA123", "Ha Noi", "Ca Mau", g);
        System.out.println(b);
        
        Ve v = new Ve("123", b, n);
        System.out.println(v);
    }
}
