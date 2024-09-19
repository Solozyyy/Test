
package MayBay;

//@author DangKhoa

public class ThongTinGhe {
    private String viTriGhe;
    boolean trangThai;
    
    public ThongTinGhe(){}
    
    public ThongTinGhe(String viTriGhe, boolean trangThai){
        this.viTriGhe = viTriGhe;
        this.trangThai = trangThai;
    }
    //Kiem tra xem ghe da duoc dat hay chua
    public boolean gheKhaThi(String viTriGhe){
        if(this.trangThai){
            return true;
        }
        return false;
    }
    //Lay vi tri ghe
    public String getViTrighe() {
        return viTriGhe;
    }
    //Lay trang thai ghe
    public boolean getTrangThai() {
        return trangThai;
    }
    //Chuyen doi trang thai cua ghe hien tai
    public void setTrangThai(){
        if(!trangThai) this.trangThai = true;
        else this.trangThai = false;
    }
    
    public String toString(){
        return this.viTriGhe;
    }
}
