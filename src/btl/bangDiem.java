
package btl;

import java.io.Serializable;
import java.util.Scanner;

public class bangDiem implements Serializable{
    private String NQL;
    private int namHoc;
    private int hocKy;
    private String khoi;

    public bangDiem() {
    }

    public bangDiem(String NQL, int namHoc, int hocKy, String khoi) {
        this.NQL = NQL;
        this.namHoc = namHoc;
        this.hocKy = hocKy;
        this.khoi = khoi;
    }

    public String getNQL() {
        return NQL;
    }

    public void setNQL(String NQL) {
        this.NQL = NQL;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public int getHocKy() {
        return hocKy;
    }

    public void setHocKy(int hocKy) {
        this.hocKy = hocKy;
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }
    
    public void nhapBD()
    {
        System.out.print("Nhap nguoi quan ly bang diem : " );
        NQL = (new Scanner(System.in)).nextLine();
        System.out.print("Nhap Khoi : ");
        khoi = (new Scanner(System.in)).nextLine();
        System.out.print("Nhap nam hoc : ");
        namHoc = (new Scanner(System.in)).nextInt();
        System.out.print("Nhap hoc ky : ");
        hocKy = (new Scanner(System.in)).nextInt();
    }
    
    public void xuat()
    {
        System.out.printf("%15s|%15s|%15d|%15d|%n", getNQL(),getKhoi(),getNamHoc(),getHocKy());
    }

    @Override
    public String toString() {
        return "BANG DIEM [" + "NQL=" + NQL + ", namHoc=" + namHoc + ", hocKy=" + hocKy + ", khoi=" + khoi + "] \n";
    }
    
}
