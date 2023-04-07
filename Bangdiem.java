package BTL;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Bangdiem {
	private static final String Collections = null;
	private int namhoc;
	private int HK;
	private String nguoiQL;
	ArrayList<Person> lstPS = new ArrayList<Person>();
	private int chon;
	private File f;
	int n;
	public void BangDiem() {}
	public void BangDiem(int nam, int HK, String nguoiQL)
	{
		this.nguoiQL = nguoiQL;
		this.namhoc = 0;
		this.HK = 0;
	}
	public String getnguoiQL()
	{
		return nguoiQL;
	}
	public void setnguoiQL(String nguoiQL)
	{
		this.nguoiQL = nguoiQL;
	}
	public int getnamhoc()
	{
		return namhoc;
	}
	public void setnamhoc(int namhoc)
	{
		this.namhoc = namhoc;
	}
	public int getHK()
	{
		return HK;
	}
	public void setHK(int HK)
	{
		this.HK = HK;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap nam hoc: ");
		namhoc=sc.nextInt();
		System.out.print("Nhap hoc ky: ");
		HK=sc.nextInt();
		System.out.print("Nhap nguoi quan ly: ");
		nguoiQL=sc.nextLine();sc.next();
		System.out.print("Nhap so luong bang diem can quan ly: ");
		n = sc.nextInt();
		lstPS = new ArrayList<Person>();
		for(int i=0;i<n;i++)
		{
			do
			{
				System.out.print("\n 1.Nhap DS hoc sinh");
				System.out.print("\n 2.Nhap DS giao vien");
				System.out.print("\n 0.Thoat chuong trinh");
				System.out.print("\n Moi lua chon: ");
				int chon;
				chon = (new Scanner(System.in)).nextInt();
				switch(chon)
				{
					case 1:
						HocSinh hs = new HocSinh();
						hs.nhap();
						lstPS.add(hs);
						break;
						
					case 2:
						GiaoVien gv = new GiaoVien();
						gv.nhap();
						lstPS.add(gv);
						break;
						
					case 0:System.exit(0);break;
				}
			}while(chon!=0);	
		}
	}
	
	public void xuat()
	{
		System.out.println("\n =====BANG DIEM===== \n");
		for(Person ps: lstPS)
		{
			ps.xuat();
		}
	}
	
	public void inDSHocSinh()
	{
		System.out.println("\n DS HOC SINH \n");
		for(Person ps: lstPS)
		{
			if( ps instanceof HocSinh)
			{
				ps.xuat();
			}
		}
	}
	
	public void inDSGiaoVien()
	{
		System.out.println("\n DS GIAO VIEN \n");
		for(Person ps: lstPS)
		{
			if( ps instanceof GiaoVien)
			{
				ps.xuat();
			}
		}
	}
	
	public void luuFile() throws FileNotFoundException,IOException
	{
		f = new File("bangdiem.dat");
		
		FileOutputStream fout = new FileOutputStream(f);
		
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(lstPS);
		
		objout.close();
		fout.close();
	}
	
	public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		File f = new File("bangdiem.dat");
		
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		lstPS = new ArrayList<Person>();
		lstPS = (ArrayList<Person>) objin.readObject();
		
		objin.close();
		fin.close();
	}
	
	public void inDiemTBtren9phay()
	{
		System.out.println("\n DS hoc sinh co diem TB tren 9.0 \n");
		for(Person ps: lstPS)
		{
			if(ps instanceof HocSinh)
			{
				if(((HocSinh) ps).getDiemTB()>9.0)
				{
					ps.xuat();
				}
			}
		}
	}
	
	public void inDiemTBduoi5phay()
	{
		System.out.println("\n DS hoc sinh co diem TB duoi 5.0 \n");
		for(Person ps: lstPS)
		{
			if(ps instanceof HocSinh)
			{
				if(((HocSinh) ps).getDiemTB()<5.0)
				{
					ps.xuat();
				}
			}
		}
	}
	
	public void sapxepDSHSDiemTB()
	{
		Collections.sort(lstPS, new HocSinhComparator());
		xuat();
	}
}