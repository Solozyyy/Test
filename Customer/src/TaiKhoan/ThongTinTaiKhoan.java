
package TaiKhoan;

//@author DangKhoa

public class ThongTinTaiKhoan {
    //tai khoan
    private String taiKhoan, matKhau;
    //nguoi dung
    private ThongTinNguoiDung nguoiDung;
    
    public ThongTinTaiKhoan(){}
    
    public ThongTinTaiKhoan(String acc, String pass, ThongTinNguoiDung nguoiDung){
        this.taiKhoan = acc;
        this.matKhau = pass;
        this.nguoiDung = nguoiDung;
    }
    //Dung de thay doi mat khau
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMatKhau() {
        return matKhau;
    }
    //
    
    public String toString(){
        return nguoiDung.toString();
    }
}
