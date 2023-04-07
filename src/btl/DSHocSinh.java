
package btl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.*;



public class DSHocSinh implements  Serializable{
    
    ArrayList<hocSinh> lstHS = new ArrayList<hocSinh>();
    
    private File f;
    
    // nhap 
    public  void nhapDSHS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG HOC SINH : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n; i++)
        {
            hocSinh x = new hocSinh();
            x.nhap_hoc_sinh();
            lstHS.add(x);
        }
        
    }
    
    // xuat ds
    public void xuatDSHS()
            
            
    {   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%15s|%n","MA","HO TEN", "DATE","GIOI TINH", "DIA CHI", "PHONE","lOP","KHOI","DIEM_1","DIEM_2","DIEM_3","THANH TICH");
        for(hocSinh x : lstHS)
        {
            x.xuat_hoc_sinh();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    // sap xep ten hoc sinh
    
    public void sapxepTenHS()
    {
        Collections.sort(lstHS, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh o1, hocSinh o2) {
                return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
            }
        });
        Collections.reverse(lstHS);
        System.out.println("DANH SACH SAO KHI SAP XEP THEO TEN  ");
        xuatDSHS();
    }
    
    // sx diem trung binh
    public void sxDiemTrungBinhLop()
    {
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap lop can tim de SX : ");
        String s = sc.nextLine();
        
        boolean  sx = true;
     
        
        for(int i = 0 ; i < lstHS.size(); i++)
        {  
            for(int j = i+1 ; j  < lstHS.size(); j++)
            {
                if(  s.equalsIgnoreCase(lstHS.get(i).getLop()) == true && (lstHS.get(i).getThanh_tich() > lstHS.get(j).getThanh_tich()) )
                {
                    hocSinh t = new hocSinh();
                    t = lstHS.get(i);
                    lstHS.set(i, lstHS.get(j));
                    lstHS.set(j, t);
                }
            }
        }
        xuatDSHS();
        
    }
    
    public  void DiemTrungBinhTheoLop()
    {   Scanner sc = new Scanner(System.in);
        float tong = 0;
        int dem = 0;
        boolean check = true;
        System.out.print("Nhap lop can tim kiem  : ");
        String s = sc.nextLine();
        for (int i = 0 ; i < lstHS.size(); i++) {
            if( s.equalsIgnoreCase(lstHS.get(i).getLop()))
            { 
               dem++;
               tong += lstHS.get(i).getThanh_tich();
            }
        }
        
        System.out.print("Diem trung binh cua lop : " + s + "la :" + (float)tong/dem + "\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    public void xoa()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP MA HOC SINH CAN XOA : ");
        String s = sc.nextLine();
        for (int i = 0 ; i < lstHS.size(); i++)
        {
             if(s.equals(lstHS.get(i).getMa()))
            {
                lstHS.remove(i);
            }
             
        }
        xuatDSHS();
    }
    
    public void HS_Diem_Cao_Thap_Nhat()
    {
        int minindex = 0, maxindex = 0;
        float diemMin, diemMax;
        diemMin = lstHS.get(0).getThanh_tich();
        diemMax = lstHS.get(0).getThanh_tich();
        for(int i = 0 ; i< lstHS.size(); i++)
        {
            if(lstHS.get(i).getThanh_tich() > diemMax)
            {
                maxindex = i;
                diemMax = lstHS.get(i).getThanh_tich();
            }
            if(lstHS.get(i).getThanh_tich() < diemMin)
            {
                minindex = i;
                diemMin = lstHS.get(i).getThanh_tich();
            }
        }
        
        System.out.print("Hoc sinh co thanh tich cao nhat : ");
        System.out.println(lstHS.get(maxindex).getHoTen() +  " : "+ lstHS.get(maxindex).getThanh_tich());
        System.out.print("Hoc sinh co thanh tich thap nhat :");
        System.out.println(lstHS.get(minindex).getHoTen()  + " :" + lstHS.get(minindex).getThanh_tich());
        
    }
    
    public void thaydoi()
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma  hoc sinh can thay doi : ");
        String v = sc.nextLine();
        boolean b = true;
        int vt = 0;
        for(int i = 0 ; i< lstHS.size(); i++)
        {
            if(v.equalsIgnoreCase(lstHS.get(i).getMa()) == true )
            {
               // lstHS.get(i).getMa() = "";
                b = true;
                vt = i;
            }
            else
            {
                System.out.println("Khong tim thay ma ");
            }
        }
        
        if(b == true )
        {
            System.out.print("Nhap ma thay doi : ");
            String td = sc.nextLine();
            lstHS.get(vt).setMa(td);
            
        }
        xuatDSHS();
    }
    
    public void ghiFile() throws FileNotFoundException, IOException
    {
        try {
        f = new File("hocsinh.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream Out = new ObjectOutputStream(fout);
        
        Out.writeObject(lstHS);
        
        Out.close();
        fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       
    }
    
    
    
    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try {
            f = new File("hocsinh.dat");
         
         FileInputStream fin = new FileInputStream(f);
         ObjectInputStream Oin = new ObjectInputStream(fin);
         
         lstHS = new ArrayList<hocSinh>();
         lstHS = (ArrayList<hocSinh>) Oin.readObject();
         
         Oin.close();
         fin.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         
    }
    
 
    

    
}
