package btapjava;

public class hs{
    private String id;
    private String ten;
    private String diemTong;
    private String uuTien;
    private String trangThai;
    private double diemSoSanh;
    
    public hs(){}
    
    public int findDot(double diem){
        String d = Double.toString(diem);
        int f = 0;
        for(char x : d.toCharArray()){
            if(x != '.') {
                f++;
            }
            else{
                break;
            }
        }
        return f;
    }
    
    public String xuLyDiemTong(Double s){
        String diem = Double.toString(s);
        char tmp = diem.charAt(findDot(s) + 1);
        if(tmp != '0') return diem.substring(0, findDot(s) + 2);
        else return diem.substring(0, findDot(s));
    }
    
    public double getDiemSoSanh(){
        return this.diemSoSanh;
    }
    
    public String getID(){
        return this.id;
    }
    
    public hs(String id, String ten, double dt, double dl, double dh){
        this.ten = ten;
        this.id = id;
        double diemTong = dt * 2 + dl + dh;
        double total = 0;
        String ut = id.substring(0, 3);
        if(ut.equals("KV1")){
            total += diemTong + 0.5;
            this.uuTien = "0.5";
        }
        else if(ut.equals("KV2")){
            total += diemTong + 1;
            this.uuTien = "1";
        }
        else if(ut.equals("KV3")){
            total += diemTong + 2.5;
            this.uuTien = "2.5";
        }
        if(total >= 24) this.trangThai = "TRUNG TUYEN";
        else this.trangThai = "TRUOT";
        this.diemSoSanh = total;
        this.diemTong = xuLyDiemTong(total);
    }
    
    public String toString(){
        return this.id + " " + this.ten + " " + this.uuTien + " " + this.diemTong + " " + this.trangThai;
    }
}