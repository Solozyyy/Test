package btapjava;

import java.util.*;
import static java.lang.Math.*;

class NV{
    private String ten, gend, ngaySinh, diaChi, fax, ngay;
    
    public NV(){}
    
    public String xuLyNgaySinh(String ngaysinh){
        StringBuilder sb = new StringBuilder(ngaysinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
    
    public NV(String ten, String gend, String ngaySinh, String dc, String fax, String ngay){
        this.ten = ten;
        this.gend = gend;
        this.ngaySinh = ngaySinh;
        this.diaChi = dc;
        this.fax = fax;
        this.ngay = ngay;
    }
    
    public String toString(){
        return "00001 " + this.ten + " " + this.gend + " " + this.ngaySinh + " " + this.diaChi + " " + this.fax + " " + this.ngay;
    }
}


public class Btapjava {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        NV nv = new NV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
   
}
