
package btl;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DSBangDiem {
    ArrayList<bangDiem> lsBD = new ArrayList<bangDiem>();
    DSHocSinh HS = new DSHocSinh();
    DSGiaoVien GV = new DSGiaoVien();
    private File f;

    public void nhapDSBD()
    {
        System.err.print("NHAP SO LUONG BANG DIEM :  ");
        int n = (new Scanner(System.in)).nextInt();
        
        for(int i = 0 ; i  < n ; i++)
        {
            bangDiem x = new bangDiem();
            x.nhapBD();
            lsBD.add(x);
            HS.nhapDSHS();
            GV.nhapDSGV();
        }
    }
    
    public void xuatDSBD()
    {
        for(int i = 0 ; i < lsBD.size() ; i++)
        {
            System.out.println("Bang diem thu : " + (i+1));
            System.out.print(lsBD.get(i).toString());
            HS.xuatDSHS();
            GV.xuatDSGV();
        }
        
    }
    
    public  void SXTenHS()
    {
        HS.sapxepTenHS();
    }
    public void SXDiemTB()
    {
        HS.sxDiemTrungBinhLop();
    }
    
    public void TinhDiemTBTheoLop()
    {
        HS.DiemTrungBinhTheoLop();
    }
    
    public void xoaTheoMa()
    {
        HS.xoa();
    }
    
    public void TKHSDiemMin_Max()
    {
        HS.HS_Diem_Cao_Thap_Nhat();
    }
    
    public void ghiFileHS() throws IOException
    {
        HS.ghiFile();
    }
    public void docFileHS() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        HS.docFile();
    }
    
    public void ghiFileGV() throws IOException
    {
        GV.ghiFile("giaovien.dat");
    }
    public void docFileGV() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        GV.docFile("giaovien.dat");
    }
    
    public void ghiFileBD()
    {
        try {
            f = new File("bangdiem.dat");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            
            out.flush();    
            out.writeObject(lsBD);
            ghiFileHS();
            ghiFileGV();
            out.close();
            fout.close(); 
            System.out.println("GHI FILE BANG DIEM THANH CONG");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void docFileBD() throws ClassNotFoundException
    {
        try {
            f = new File("bangdiem.dat");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(fin);
            
            lsBD = (ArrayList<bangDiem>) oin.readObject();
            docFileHS();
            docFileGV();
            oin.close();    
            fin.close();    
            System.out.println("DOC FILE BANG DIEM THANH CONG ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
