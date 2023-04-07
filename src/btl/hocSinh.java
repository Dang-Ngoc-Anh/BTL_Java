
package btl;

import java.io.Serializable;
import java.util.*;


public class hocSinh extends perSon implements Serializable{
    private float diem_1;
    private float diem_2;
    private float diem_3;
    private String lop;
    private String khoi;
    

    
    public void nhap_hoc_sinh(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap khoi : ");
        khoi = (new Scanner(System.in)).nextLine();
        System.out.print("Nhap lop :");
        lop = (new Scanner(System.in)).nextLine();
        System.out.print("Nhap diem he so 1 : ");
        diem_1 = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem he so 2 : ");
        diem_2 = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap diem he so 3 : ");
        diem_3 = Float.parseFloat(sc.nextLine());
        
    }
    public void xuat_hoc_sinh(){

        super.xuat();
        System.out.printf("%15s|%15s|%15f|%15f|%15f|%15f|%n" ,getLop(), getKhoi(),getDiem_1(),getDiem_2(),getDiem_3(),getThanh_tich());
        
    }

    @Override
    public String toString() {
        String sc = null;
        return "hocSinh{" + "diem_1=" + diem_1 + ", diem_2=" + diem_2 + ", diem_3=" + diem_3 + ", lop=" + lop + ", khoi=" + khoi + ", sc=" + sc + '}';
    }

    public float thanh_tich(){
        return (diem_1 + 2*diem_2 + 3*diem_3)/6;
    }
    
    public float getThanh_tich(){
        return thanh_tich();
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public float getDiem_1() {
        return diem_1;
    }

    public void setDiem_1(float diem_1) {
        this.diem_1 = diem_1;
    }

    public float getDiem_2() {
        return diem_2;
    }

    public void setDiem_2(float diem_2) {
        this.diem_2 = diem_2;
    }

    public float getDiem_3() {
        return diem_3;
    }

    public void setDiem_3(float diem_3) {
        this.diem_3 = diem_3;
    }

    public hocSinh(float diem_1, float diem_2, float diem_3, String lop, String khoi) {
        this.diem_1 = diem_1;
        this.diem_2 = diem_2;
        this.diem_3 = diem_3;
        this.lop = lop;
        this.khoi = khoi;
    }
    public hocSinh() {
    }
    
    
}
