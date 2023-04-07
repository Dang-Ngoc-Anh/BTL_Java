package BTL;

import java.io.Serializable;
import java.util.Scanner;

public class GiaoVien extends Person implements Serializable{
	private String chuyenNganh;
    private String HocHam;
    private String monGD;

    public GiaoVien()
    {
        super();
        chuyenNganh = ""; HocHam = ""; monGD = "";
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh = sc.nextLine();
        System.out.print("Nhap hoc ham: ");
        HocHam = sc.nextLine();
        System.out.print("Nhap monGD: ");
        monGD = sc.nextLine();
    }
    public void xuat()
    {
        super.xuat();
        System.out.printf("\n %15s" , chuyenNganh);
        System.out.printf("%15s" , HocHam);
        System.out.printf("%15s" , monGD);
    }
}