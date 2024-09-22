
package ThongTinVe;

//@author DangKhoa
import MayBay.ThongTinMayBay;
import TaiKhoan.ThongTinNguoiDung;

public class Ve {
    private String ID;
    ThongTinMayBay thongTinMayBay;
    ThongTinNguoiDung thongTinNguoiDung;
    
    public Ve(){}
    
    public Ve(String id, ThongTinMayBay ttmb, ThongTinNguoiDung ttnd){
        this.ID = id;
        this.thongTinMayBay = ttmb;
        this.thongTinNguoiDung = ttnd;
    }

    public ThongTinMayBay getThongTinMayBay() {
        return thongTinMayBay;
    }

    public ThongTinNguoiDung getThongTinNguoiDung() {
        return thongTinNguoiDung;
    }
    
    public String toString(){
        return this.ID + " " + this.thongTinNguoiDung + " " + this.thongTinMayBay;
    }
    
}
