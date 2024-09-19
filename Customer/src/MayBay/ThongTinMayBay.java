
package MayBay;

//@author DangKhoa

public class ThongTinMayBay {
    private String thoiGianBay, tenMayBay, soHieu, diemBatDau, diemKetThuc;
    private ThongTinGhe thongTinGhe;
    
    public ThongTinMayBay(){}
    
    public ThongTinMayBay(String thoiGian, String ten, String soHieu, String batDau, String ketThuc, ThongTinGhe t){
        this.thoiGianBay = thoiGian;
        this.tenMayBay = ten;
        this.soHieu = soHieu;
        this.diemBatDau = batDau;
        this.diemKetThuc = ketThuc;
        this.thongTinGhe = t;
    }
    
    public String toString(){
        return this.soHieu + " " + this.tenMayBay + " " + this.thoiGianBay + " " + this.diemBatDau + " " + this.diemKetThuc + " " + this.thongTinGhe;
    }
    
}
