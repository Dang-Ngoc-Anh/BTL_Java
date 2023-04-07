package BTL;

import java.io.IOException;
import java.util.Scanner;

public class QuanlyBangDiem {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Bangdiem BD = new Bangdiem();
		int chon;
		do
		{
			System.out.print("\n 1.Nhap bang diem");
			System.out.print("\n 2.In bang diem");
			System.out.print("\n 3.Luu bang diem vao file");
			System.out.print("\n 4.Doc bang diem tu file");
			System.out.print("\n 5.In danh sach hoc sinh tren 9.0");
			System.out.print("\n 6.In danh sach hoc sinh duoi 5.0");
			System.out.print("\n 7.Sap xep diem trung binh cua hoc sinh");
			System.out.print("\n 0.Thoat chuong trinh");
			System.out.print("\n Nhap lua chon: ");
			Scanner sc = new Scanner(System.in);
			chon = sc.nextInt();
			switch(chon)
			{
			case 1: BD.nhap();break;
			case 2: BD.xuat();break;
			case 3: BD.luuFile();break;
			case 4: BD.docFile();break;
			case 5: BD.inDiemTBtren9phay();break;
			case 6: BD.inDiemTBduoi5phay();break;
			/* case 7: sapxepDSHSDiemTB();break;	*/		
			}
		}while(chon!=0);
		
	}

}
