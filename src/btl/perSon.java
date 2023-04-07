
package btl;

import java.io.Serializable;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class perSon implements Serializable {
    private String  ma;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String phone;
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma : ");
        ma = input.nextLine();
        System.out.print("Nhap ho ten : ");
        hoTen = input.nextLine();
        System.out.print("Nhap ngay sinh : ");
        ngaySinh = input.nextLine();
        System.out.print("Nhap gioi tinh : ");
        gioiTinh = input.nextLine();
        System.out.print("Nhap dia chi : ");
        diaChi = input.nextLine();
        System.out.print("Nhap so dien thoai : " );
        phone = input.nextLine();
       
       
    }
   public void xuat(){
       System.out.printf("%15s|%15s|%15s|%15s|%15s|%15s|", getMa(),getHoTen(),getngaySinh(),getGioiTinh(),getDiaChi(),getPhone());

   }

    @Override
    public String toString() {
        return "Person{" + "ma=" + ma + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", phone=" + phone + '}';
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public perSon() {
    }

    public perSon(String ma, String hoTen, String DMY, String gioiTinh, String diaChi, String phone) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.phone = phone;
    }
    
    
}
