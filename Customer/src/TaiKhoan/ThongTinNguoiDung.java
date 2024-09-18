
package TaiKhoan;

//@author DangKhoa

public class ThongTinNguoiDung extends ThongTinTaiKhoan{
    private String tenNguoiDung, ngaySinh, diaChi, danToc, soCanCuocCongDan;
    
    public ThongTinNguoiDung(){}
    //Comparator set thong tin cho account va user
    public ThongTinNguoiDung(String ten, String ngaySinh, String diaChi, String danToc, String canCuoc){
        this.tenNguoiDung = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.danToc = danToc;
        this.soCanCuocCongDan = canCuoc;
    }
    //Chinh sua ten
    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }
    //Chinh sua ngay sinh
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    //Chinh sua dia chi
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    //Chinh sua dan toc
    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }
    //Chinh sua can cuoc
    public void setSoCanCuocCongDan(String soCanCuocCongDan) {
        this.soCanCuocCongDan = soCanCuocCongDan;
    }

    ////
    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getSoCanCuocCongDan() {
        return soCanCuocCongDan;
    }
    
    public String toString(){
        return this.tenNguoiDung + " " + this.ngaySinh + " " + this.diaChi + " " + this.danToc + " " + this.soCanCuocCongDan; 
    }
}
