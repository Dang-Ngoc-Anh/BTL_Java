package BTL;

import java.util.Scanner;

public class Person {
	private String ma;
	private String Hoten;
	private String gioitinh;
	private String ngaysinh;
	private String sodienthoai;
	private String diachi;

	public Person() {}
	public Person(String ma, String Hoten, String gioitinh, String ngaysinh, String sodienthoai, String diachi)
	{
		this.ma	= ma;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
		this.Hoten = Hoten;
		this.ngaysinh = ngaysinh;
		this.sodienthoai = sodienthoai;
	}
	public String getma()
	{
		return ma;
	}
	public void setma(String ma)
	{
		this.ma = ma;
	}
	public String getHoten()
	{
		return Hoten;
	}
	public void setHoten(String Hoten)
	{
		this.Hoten = Hoten;
	}
	public String getgioitinh()
	{
		return gioitinh;
	}
	public void setgioitinh(String gioitinh)
	{
		this.gioitinh = gioitinh;
	}
	public String getsodienthoai()
	{
		return sodienthoai;
	}
	public void setsodienthoai(String sodienthoai)
	{
		this.sodienthoai = sodienthoai;
	}
	public String getdiachi()
	{
		return diachi;
	}
	public void setdiachi(String diachi)
	{
		this.diachi = diachi;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma: ");
		ma = sc.nextLine();
		System.out.print("Nhap Ho Ten: ");
		Hoten = sc.nextLine();
		System.out.print("Nhap Gioi Tinh: ");
		gioitinh = sc.nextLine();
		System.out.print("Nhap Ngay Sinh: ");
		ngaysinh = sc.nextLine();
		System.out.print("Nhap So Dien Thoai: ");
		sodienthoai = sc.nextLine();
		System.out.print("Nhap Dia Chi: ");
		diachi = sc.nextLine();
	}
	public void xuat()
	{
		System.out.printf("\n %%10s",ma);
		System.out.printf(" %20s",Hoten);
		System.out.printf(" %5s",gioitinh);
		System.out.printf(" %12s",ngaysinh);
		System.out.printf(" %20s",sodienthoai);
		System.out.printf(" %20s",diachi);
	}
	
	
}