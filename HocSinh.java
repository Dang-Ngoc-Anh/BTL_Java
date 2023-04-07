package BTL;

import java.io.Serializable;
import java.util.Scanner;

public class HocSinh extends Person implements Serializable{
	private String lop;
	private String khoi;
	private float diemhs1;
	private float diemhs2;
	private float diemthi;
	
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
	
	public HocSinh()
    {
        super();
        setLop(""); setKhoi("");
        diemhs1 = 0; diemhs1 = 0; diemhs1 = 0;
    }
	
	public void nhap()
	{
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap lop: ");
		setLop(sc.nextLine());
		System.out.print("Nhap khoi: ");
		setKhoi(sc.nextLine());
		System.out.print("Nhap Diem He So 1: ");
		diemhs1 = sc.nextFloat();
		System.out.print("Nhap Diem He So 2: ");
		diemhs2 = sc.nextFloat();
		System.out.print("Nhap Diem Thi: ");
		diemthi = sc.nextFloat();
	}
	public void xuat()
	{
		super.xuat();
		System.out.printf("\n %7.1f",diemhs1);
		System.out.printf(" %7.1f",diemhs2);
		System.out.printf(" %7.1f",diemthi);
		System.out.printf(" %7.1f",getDiemTB());
	}
	
	public float diemTB()
	{
		return (float) ((diemhs1 + 2 * diemhs2 + 3 * diemthi)/6);
	}
	
	public float getDiemTB()
	{
		return diemTB();
	}

}