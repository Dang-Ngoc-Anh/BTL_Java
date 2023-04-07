
package btl;

import java.util.Scanner;
import  java.io.*;

import java.util.*;
public class giaoVien extends perSon implements Serializable{
    private String chuyenNganh;
    private String HocHam;
    private String monGD;
    private String lopDay;

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getHocHam() {
        return HocHam;
    }

    public void setHocHam(String HocHam) {
        this.HocHam = HocHam;
    }

    public String getMonGD() {
        return monGD;
    }

    public void setMonGD(String monGD) {
        this.monGD = monGD;
    }
    
    public String getLopDay()
    {
        return lopDay;
    }
    
    public void setLopDay()
    {
        this.lopDay = lopDay;
    }
    public giaoVien()
    {
        
    }

    public giaoVien(String chuyenNganh, String HocHam, String monGD) {
        this.chuyenNganh = chuyenNganh;
        this.HocHam = HocHam;
        this.monGD = monGD;
    }
    
    public void nhap_giao_vien()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen nganh : ");
        chuyenNganh = sc.nextLine();
        System.out.print("Nhap hoc ham : ");
        HocHam = sc.nextLine();
        System.out.print("Nhap monGD : ");
        monGD = sc.nextLine();
        System.out.print("Nhap lop giao vien day : ");
        lopDay = sc.nextLine();
    }
    public void xuat_giao_vien()
{    
        super.xuat();
        System.out.printf("%15s|%15s|%15s|%15s|%n" , getChuyenNganh(),getHocHam(),getMonGD(),getLopDay());
       
}

    @Override
    public String toString() {
        return "teacher{" + "chuyenNganh=" + chuyenNganh + ", HocHam=" + HocHam + ", monGD=" + monGD + '}';
    }
}
