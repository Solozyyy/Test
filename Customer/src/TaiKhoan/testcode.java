
package TaiKhoan;

import java.util.*;

public class testcode {
    public static void main(String[] args) {
        // Tạo đối tượng ThongTinNguoiDung
        ThongTinNguoiDung n = new ThongTinNguoiDung("DCMinh", "12/34/56", "Ha Noi", "Hmong", "01231241251215");
        
        // Tạo đối tượng ThongTinTaiKhoan và truyền đối tượng nguoiDung
        ThongTinTaiKhoan t = new ThongTinTaiKhoan("helloae", "123345", n);
        System.out.println(t);
    }
}
